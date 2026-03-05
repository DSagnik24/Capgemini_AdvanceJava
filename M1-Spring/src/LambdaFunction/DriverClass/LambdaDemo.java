package LambdaFunction.DriverClass;

import java.util.Scanner;

public class LambdaDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        MathOperation add = (x,y) ->x+y;
        System.out.println(add.operation(a,b));

        MathOperation sub = (x,y) ->x-y;
        System.out.println(sub.operation(a,b));

        MathOperation mul = (x,y) ->x*y;
        System.out.println(mul.operation(a,b));

        MathOperation div = (x,y) ->x/y;
        System.out.println(add.operation(a,b));
    }
}
