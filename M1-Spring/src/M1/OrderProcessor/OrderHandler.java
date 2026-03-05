package M1.OrderProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class OrderHandler implements IOrderHandler {

    private final List<OrderType> processedOrders = new ArrayList<>();

    @Override
    public void handleOrders(Queue<OrderType> batch) {
        System.out.println("Processing batch:");
        while (!batch.isEmpty()) {
            OrderType o = batch.poll();
            processedOrders.add(o);
            System.out.println("Processed: " + o);
        }
    }

    public List<OrderType> getAllProcessedOrders() {
        return processedOrders;
    }
}
