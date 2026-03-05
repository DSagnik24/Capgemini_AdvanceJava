package M1.NotificationDispathcSystem;

import java.util.Queue;

public interface INotificationDispatcher {
    void dispatchBatch(Queue<NotificationType> batch);
}
