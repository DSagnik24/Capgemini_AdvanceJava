public class IntegerConversion {
    public static void main(String[] args) {
        int num = 42;

//        Integer obj1 = new Integer(num);

        Integer obj2 = Integer.valueOf(num);

        Integer obj3 = num;

        System.out.println(obj2);
        System.out.println(obj3);


    }
}
