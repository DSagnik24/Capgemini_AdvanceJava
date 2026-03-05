package M1.AnalyticsSystemDesign;

import java.util.Queue;

public interface IAnalyticsStore {
    void storeActions(Queue<ActionEnum> q);
}
