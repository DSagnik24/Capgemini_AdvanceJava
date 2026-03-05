package MultiThreading;

public class Main{
    public static void main(String[] args) throws InterruptedException {
       for(int i = 0;i<5;i++){
           MultiThreading th = new MultiThreading(i);
           th.sleep(100);
           th.start();
       }
    }
}
