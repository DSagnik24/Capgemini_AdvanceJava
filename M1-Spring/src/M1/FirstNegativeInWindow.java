package M1;

import java.util.ArrayList;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int []arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;

        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                list.add(arr[i]);
            }

            if(i>= k-1){
                if(list.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(list.get(0));
                }

                if(arr[i-k+1]<0){
                    list.remove(0);
                }
            }
        }

    }
}
