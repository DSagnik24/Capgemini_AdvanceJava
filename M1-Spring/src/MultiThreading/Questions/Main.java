package MultiThreading.Questions;


import MultiThreading.Questions.PrintInOrder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=3;i++){
            PrintInOrder th = new PrintInOrder(i);
            th.sleep(100);
            th.run();
        }
    }
}
