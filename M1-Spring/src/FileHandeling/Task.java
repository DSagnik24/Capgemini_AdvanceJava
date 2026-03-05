package FileHandeling;

public class Task {

    public void countDown() throws InterruptedException {

        for(int i = 0; i <= 5; i++) {
            System.out.println("Count: " + i);
            Thread.sleep(1000);
        }
//        System.out.println("Thread is waiting...");
//        wait();   // releases lock and waits
//
//        System.out.println("Thread resumed!");
    }
//
//    public synchronized void wakeUp() throws InterruptedException {
//
//        Thread.sleep(3000);
//        System.out.println("Notifying...");
//        notify();   // wakes the waiting thread
//    }
}