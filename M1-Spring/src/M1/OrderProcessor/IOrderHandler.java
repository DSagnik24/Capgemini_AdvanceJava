package M1.OrderProcessor;

import java.util.Queue;

public interface IOrderHandler {
    void handleOrders(Queue<OrderType> batch);
}
