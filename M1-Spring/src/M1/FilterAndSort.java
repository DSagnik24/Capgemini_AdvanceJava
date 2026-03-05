package M1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FilterAndSort {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,6,1,8,4,7);
        List<Integer> even = new ArrayList<>();
        for(int i:nums){
            if(i%2 == 0){
                even.add(i);
            }
        }
        Collections.sort(even.reversed());
        System.out.println(even);
    }
}
