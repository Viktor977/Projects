package Threads;

public class ThreadOne extends Thread {
    public  void run(){
        while (true){
            System.out.print("A");
        }
    }
}
