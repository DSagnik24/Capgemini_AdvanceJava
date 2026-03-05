package Basics;

// T - type, N - Number, K - key, V - Values, E - Element
public class Main1 {
    public static void main(String[] args) {
        Box<String> box = new Box();
        box.set("10");

        String s = (String) box.get();
    }
}

class Box<T>{
    Object value;

    void set(Object value){
        this.value = value;
    }
    Object get(){
        return value;
    }
}