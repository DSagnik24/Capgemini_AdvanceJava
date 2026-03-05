package ExceptionHandeling.One;

public class TestDivision {
    public static void main(String[] args) {
        Divider d = new Divider();
        System.out.println(d.divide(10,2));
        System.out.println(d.divide(8,0));
    }
}
