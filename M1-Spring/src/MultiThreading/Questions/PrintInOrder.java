package MultiThreading.Questions;



public class PrintInOrder extends Thread{
    int th;

    public PrintInOrder(int th){
        this.th = th;
    }
    public void run (){
        for(int i=1;i<=3;i++){
            System.out.println("T"+i+" - "+th);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
