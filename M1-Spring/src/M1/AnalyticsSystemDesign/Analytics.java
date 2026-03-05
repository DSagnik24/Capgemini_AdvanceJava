package M1.AnalyticsSystemDesign;

import java.util.*;

public class Analytics {
    private IAnalyticsStore analyticsStore;
    private int K;

    public Analytics(AnalyticsStore analyticsStore, int K){
        this.analyticsStore = analyticsStore;
        this.K = K;
    }
    HashMap<ActionEnum, Integer> freqMap = new HashMap<>();
    Queue<ActionEnum> queue = new LinkedList<>();
    private int totalActions;

    void RegisterAction(ActionEnum actionEnum){
        queue.offer(actionEnum);
        totalActions++;

        freqMap.put(actionEnum,freqMap.getOrDefault(actionEnum,0)+1);


        if(queue.size()==K){
            analyticsStore
                    .storeActions(new LinkedList<>(queue));
            queue.clear();
        }
    }
    int getNumberOfActionRegisteredButNotSenttoAnalyticsStore(){
        return queue.size();
    }
    int getTotalNumberofLoggedActions(){
        return  totalActions;
    }
    List<ActionEnum> getMostFrequentlyUsedActions(){
       int maxFreq = Collections.max(freqMap.values());

       List<ActionEnum> res = new ArrayList<>();

       for(Map.Entry<ActionEnum,Integer>entry: freqMap.entrySet()){
           if(entry.getValue() == maxFreq){
               res.add(entry.getKey());
           }
       }
       res.sort(Comparator.comparing(Enum::name));
       return res;
    }

}
