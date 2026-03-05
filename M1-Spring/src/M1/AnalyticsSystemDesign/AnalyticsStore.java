package M1.AnalyticsSystemDesign;

import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsStore implements IAnalyticsStore {
    private List<ActionEnum> stored = new ArrayList<>();

    @Override
    public void storeActions(Queue<ActionEnum> q) {
        System.out.println("Storing actions to AnalyticsStore:");
        while (!q.isEmpty()) {
            ActionEnum action = q.poll();
            stored.add(action);
            System.out.println("  " + action);
        }
    }

    public List<ActionEnum> getStoredActions() {
        return stored;
    }
}
