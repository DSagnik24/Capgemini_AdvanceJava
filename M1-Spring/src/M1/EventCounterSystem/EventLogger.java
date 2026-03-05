package M1.EventCounterSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class EventLogger implements IEventLogger {

    private final List<EventType> storedEvents = new ArrayList<>();

    @Override
    public void logBatch(Queue<EventType> batch) {
        System.out.println("Saving batch to logger:");
        while (!batch.isEmpty()) {
            EventType e = batch.poll();
            storedEvents.add(e);
            System.out.println("Logged: " + e);
        }
    }

    public List<EventType> getStoredEvents() {
        return storedEvents;
    }
}
