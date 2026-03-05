package Stream.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> res = new ArrayList<>();

        for (int i:list1){
            if(i%2 == 0){
                res.add(i);
            }
        }

        //In place of this we can use Stream

// Collection -> Stream -> Filter -> Transform -> Collect -> Result
        List<Integer> even = list1.stream()// source
                .filter(n->n%2 == 0)//Intermediate
                .map(n->n*2)
                .toList();// collect

        System.out.println(res);
        System.out.println(even);
    }

}
