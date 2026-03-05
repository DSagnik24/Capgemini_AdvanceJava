package ExceptionHandeling.Two;

public class AgeTest {
    public static void main(String[] args) {
        try{
            Validator.validate(16);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
