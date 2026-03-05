package FileHandeling;

public class Main2 {
    public static void main(String[] args) {
        Task t1= new Task();
        Task t2= new Task();
        Thread th1 = new Thread(()-> {
           try{
               t1.countDown();
           }catch (InterruptedException e){
               throw new RuntimeException(e);
           }
        },"TH1");
        Thread th2 = new Thread(() -> {
            try {
                th1.join();
                t2.countDown();   // this will notify
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        th1.start();
        th2.start();
    }
}
