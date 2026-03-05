package M1.NotificationDispathcSystem;

import java.util.*;

public class NotificationManager {
    private INotificationDispatcher dispatcher;
    int M;

    public NotificationManager(INotificationDispatcher dispatcher, int M){
        this.dispatcher = dispatcher;
        this.M = M;
    }

    Queue<NotificationType> notif = new LinkedList<>();
    Map<NotificationType, Integer> freqMap = new HashMap<>();
    int totalNotifs = 0;

    void recordNotification(NotificationType type){
        notif.offer(type);
        totalNotifs++;

        freqMap.put(type,freqMap.getOrDefault(type,0)+1);

        if(notif.size() == M){
            dispatcher.dispatchBatch(notif);
            notif.clear();
        }
    }
    int pendingCount(){
        return notif.size();
    }
    int totalCount(){
         return totalNotifs;
    }
    List<NotificationType> mostFrequentTypes(){

        if(freqMap.isEmpty()){
            return new ArrayList<>();
        }

        int mostFreq = Collections.max(freqMap.values());

        ArrayList<NotificationType> res = new ArrayList<>();

        for(Map.Entry<NotificationType, Integer> i : freqMap.entrySet()){
            if(i.getValue() == mostFreq){
                res.add(i.getKey());
            }
        }
        Collections.sort(res);
        return res;

    }
}
