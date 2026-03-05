package M1.NotificationDispathcSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class NotificationDispatcher implements INotificationDispatcher {

    private List<NotificationType> dispatched = new ArrayList<>();

    @Override
    public void dispatchBatch(Queue<NotificationType> batch) {
        System.out.println("Dispatching batch…");
        while (!batch.isEmpty()) {
            NotificationType n = batch.poll();
            dispatched.add(n);
            System.out.println("  Sent: " + n);
        }
    }

    public List<NotificationType> getDispatchedNotifications() {
        return dispatched;
    }
}
