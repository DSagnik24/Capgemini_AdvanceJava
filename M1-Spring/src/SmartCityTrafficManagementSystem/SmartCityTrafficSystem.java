package SmartCityTrafficManagementSystem;

import java.util.*;

public class SmartCityTrafficSystem {
    ArrayList<Vehicle>logs = new ArrayList<>();
    LinkedList<Vehicle>lastEntries = new LinkedList<>();
    HashMap<String, List<Vehicle>>checkpointMap = new HashMap<>();
    HashMap<String, Vehicle>vehicleLookup = new HashMap<>();
    PriorityQueue<Vehicle>emergencyQueue = new PriorityQueue<>();

    public void addVehicle(Vehicle v){
        logs.add(v);
        vehicleLookup.put(v.getVehicleNumber(),v);

        checkpointMap
                .computeIfAbsent(v.getCheckPoint(),k->new ArrayList<>())
                .add(v);

        emergencyQueue.add(v);
        lastEntries.addFirst(v);
        if(lastEntries.size()>5){
            lastEntries.removeLast();
        }
        System.out.println("Entry Added");
    }
    public void removeDuplicate(){
        HashSet<Vehicle> set = new HashSet<>();
        for(Vehicle v:logs) set.add(v);
        System.out.println("Duplicates removed");
    }
    public void displayCheckPoint(String checkPoint){
        List<Vehicle> list = checkpointMap.get(checkPoint);

        if(list.isEmpty()||list == null){
            System.out.println("No Vehicles found at this checkpoint");
            return;
        }

        System.out.println("Vehicles at "+checkPoint+": ");
        for(Vehicle v: list){
            System.out.println(v);
        }

    }
    public void processEmergencyQueue(){
        Vehicle v = emergencyQueue.poll();

        if(v == null){
            System.out.println("No vehicle in queue");
        }else{
            System.out.println("Processing vehicle: "+v);
        }
    }
    public void trafficReport(){
        HashMap<String,Integer> congestion = new HashMap<>();

        for(Vehicle v: logs){
            congestion.put(
                    v.getCheckPoint(),
                    congestion.getOrDefault(v.getCheckPoint(),0)+1
            );
        }
        System.out.println("Traffic Report");

        for(String s: congestion.keySet()){
            System.out.println(s+" "+congestion.get(s));
        }
        String busiest = Collections.max(congestion.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        String leastBusiest = Collections.max(congestion.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        System.out.println("Busiest: "+busiest);
        System.out.println("Busiest: "+leastBusiest);
    }

    public void showLast5(){
        for(Vehicle v:lastEntries){
            System.out.println(v);
        }
    }

    public void searchByVehicleNumber(String number){
        Vehicle v = vehicleLookup.get(number);

        if(v == null){
            System.out.println("Vehicle not found");
        }else{
            System.out.println(v);
        }
    }

}
