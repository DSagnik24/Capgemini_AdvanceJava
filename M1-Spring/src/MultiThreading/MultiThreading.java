package MultiThreading;

public class MultiThreading extends Thread{
    int th;

    public MultiThreading(int th){
        this.th = th;
    }
    public void run (){
        for(int i=0;i<=5;i++){
            System.out.println(i+"Thread Number: "+th);
            if(th == 3){
                throw new RuntimeException();
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
