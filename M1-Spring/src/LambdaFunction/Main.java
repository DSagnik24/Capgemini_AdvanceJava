package LambdaFunction;

public class Main {
    public static void main(String[] args) {
        SumInter sum1 = (a,b)->{
            return a+b;
        };

        System.out.println(sum1.sum(2,6));

        LengthInter lt  = (s->s.length());
        System.out.println(lt.length("SAGNIKdutta"));
    }
}
