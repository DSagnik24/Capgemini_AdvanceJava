package ExceptionHandeling.Two;

public class Validator {
    public static void validate(int age)throws InvalidAgeException{
        if(age <18){
            throw new InvalidAgeException("Age cannot be less than 18");
        }
    }
}
