package SmartCityTrafficManagementSystem;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCityTrafficSystem system = new SmartCityTrafficSystem();

        while (true) {

            System.out.println("\n=== SMART CITY TRAFFIC MANAGEMENT ===");
            System.out.println("1. Add Vehicle Entry");
            System.out.println("2. Remove Duplicates");
            System.out.println("3. Display Vehicles by Checkpoint");
            System.out.println("4. Process Emergency Vehicle Queue");
            System.out.println("5. Traffic Report");
            System.out.println("6. Show Last 5 Vehicles");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Vehicle Number: ");
                    String number = sc.nextLine();

                    System.out.print("Type (Car/Bike/Ambulance/FireTruck): ");
                    String type = sc.nextLine();

                    System.out.print("Checkpoint: ");
                    String checkpoint = sc.nextLine();

                    system.addVehicle(new Vehicle(number, type, checkpoint));
                    break;

                case 2:
                    system.removeDuplicate();
                    break;

                case 3:
                    System.out.print("Enter checkpoint name: ");
                    system.displayCheckPoint(sc.nextLine());
                    break;

                case 4:
                    system.processEmergencyQueue();
                    break;

                case 5:
                    system.trafficReport();
                    break;

                case 6:
                    system.showLast5();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
