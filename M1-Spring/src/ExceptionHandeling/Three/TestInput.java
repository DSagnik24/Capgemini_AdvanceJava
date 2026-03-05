package ExceptionHandeling.Three;

public class TestInput {
    public static void main(String[] args) {
        InputProcessor ip = new InputProcessor();
        ip.process(null);
        ip.process("abc");
    }
}
