package M1.OrderProcessor;

import SmartLogisticsOrderProcessing.Order;

import java.util.*;

public class OrderProcessor {
    IOrderHandler handler;
    int P;
    public OrderProcessor(IOrderHandler handler, int P){
        this.handler = handler;
        this.P = P;
    }

    Queue<OrderType> logs = new LinkedList<>();
    Map<OrderType, Integer> freqMap = new HashMap<>();
    int totalOrdersNum;

    void placeOrder(OrderType type){
        logs.add(type);
        totalOrdersNum++;

        freqMap.put(type,freqMap.getOrDefault(type,0)+1);

        if(logs.size() == P){
            handler.handleOrders(logs);
            logs.clear();
        }
    }
    int pendingCount(){
        return logs.size();
    }
    int totalOrders(){
        return totalOrdersNum;
    }
    List<OrderType> mostFrequentOrderTypes(){
        if(freqMap.isEmpty()){
            return  new ArrayList<>();
        }
        int max = Collections.max(freqMap.values());

        ArrayList<OrderType>res = new ArrayList<>();

        for(Map.Entry<OrderType,Integer> i : freqMap.entrySet()){
            if(i.getValue() == max){
                res.add(i.getKey());
            }
        }
        res.sort(Comparator.comparing(Enum::name));
        return res;
    }
}
