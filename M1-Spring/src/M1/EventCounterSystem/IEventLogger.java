package M1.EventCounterSystem;

import java.util.Queue;

public interface IEventLogger {
    void logBatch(Queue<EventType> batch);
}
