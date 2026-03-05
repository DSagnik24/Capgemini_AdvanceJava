package M1.EventCounterSystem;

import java.util.*;

public class EventCounter {
    IEventLogger logger;
    int N;

    public EventCounter(IEventLogger logger,int N){
        this.logger = logger;
        this.N = N;
    }

    Queue<EventType> logs = new LinkedList<>();
    Map<EventType, Integer> freqMap = new HashMap<>();
    int totalLogs = 0;


    void registerEvent(EventType event){
        logs.offer(event);
        totalLogs++;

        freqMap.put(event, freqMap.getOrDefault(event,0)+1);

        if(logs.size() == N){
            logger.logBatch(new LinkedList<>(logs));
            logs.clear();
        }
    }
    int getPendingCount(){
        return logs.size();
    }
    int getTotalCount(){
        return totalLogs;
    }
    List<EventType> getTopEvents(){
        List<EventType> res = new ArrayList<>();
        int mostFreq = Collections.max(freqMap.values());

        for(Map.Entry<EventType,Integer>e:freqMap.entrySet()){
            if(e.getValue() == mostFreq){
                res.add(e.getKey());
            }
        }
        res.sort(Comparator.comparing(EventType::name));
        return res;
    }
}
