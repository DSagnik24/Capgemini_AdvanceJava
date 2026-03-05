package ExceptionHandeling.Three;

public class InputProcessor {
    public void process(String s){
        try{
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
}
