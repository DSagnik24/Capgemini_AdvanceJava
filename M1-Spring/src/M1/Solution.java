package M1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> logs = new ArrayList<>();
        logs.add(Arrays.asList("02-01-2023","1:30","ERROR","failed"));
        logs.add(Arrays.asList("01-01-2023","04:00","INFO","established"));
        logs.add(Arrays.asList("01-01-2023","14:00","CRITICAL","bad"));

        List<List<String>> result = extractErrorLogs(logs);
        result.forEach(System.out::println);
    }

    private static List<List<String>> extractErrorLogs(List<List<String>> logs) {
        return logs.stream()
                .filter(log->{
                    String status = log.get(2);
                    return status.equals("ERROR")||status.equals("CRITICAL");
                })
                //sorted by parsed date + time

                .sorted(Comparator.comparing((List<String> log)->{
                    String[]d = log.get(0).split("-");
                    int day = Integer.parseInt(d[0]);
                    int month = Integer.parseInt(d[1]);
                    int year = Integer.parseInt(d[2]);
                    return year *10000+month*100+day;
                }).thenComparing(log->{
                    String[] t = log.get(1).split(":");
                    int hour = Integer.parseInt(t[0]);
                    int min = Integer.parseInt(t[1]);
                    return hour*100 + min;
                        })
                ).collect(Collectors.toList());
    }
}
