package LambdaFunction.StringProcessing;

public class StringDemo {
    public static void main(String[] args) {
        String s = "JavaProgramming";

        StringOperation upperCase = (st)->st.toUpperCase();
        System.out.println(upperCase.operation(s));

        StringOperation lowerCase = (st)->st.toLowerCase();
        System.out.println(lowerCase.operation(s));

        StringOperation rev = (st)->
                new StringBuilder(s).reverse().toString();
        System.out.println(rev.operation(s));

        StringOperation length1 = st->{
            int count = 0;
            for(char c:s.toCharArray()){
                count++;
            }
            return String.valueOf(count);
        };
        System.out.println(length1.operation(s));
    }
}
