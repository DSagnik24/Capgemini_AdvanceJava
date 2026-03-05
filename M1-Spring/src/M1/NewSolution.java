package M1;

import java.util.Arrays;

public class NewSolution {
    public static void main(String[] args) {
        String[]logs = {
                "a1 9 2 3 1",
                "g1 Act car",
                "zo4 4 7",
                "ab1 off key dog",
                "a8 act zoo"
        };
        String[] res = reorderLogs(logs);
        System.out.println(Arrays.toString(res));
    }

    private static String[] reorderLogs(String[] logs) {
        Arrays.sort(logs,(log1, log2)->{
            int i1 = log1.indexOf(" ");
            int i2 = log2.indexOf(" ");

            String is1 = log1.substring(0,i1);
            String is2 = log2.substring(0,i2);

            String a = log1.substring(i1+1);
            String b = log2.substring(i2+1);

            boolean Digit1 = Character.isDigit(a.charAt(0));
            boolean Digit2 = Character.isDigit(a.charAt(0));

            if(!Digit1 && !Digit2) {
                int comp = a.compareTo(b);
                if (comp != 0) {
                    return comp;
                }
                return is1.compareTo(is2);
            }

            if(!Digit1 && Digit2)return -1;
            if(Digit1 && !Digit2)return -1;
            return 0;
        });
        return logs;
    }
}
