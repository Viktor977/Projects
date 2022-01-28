package Threads;

public class ThreadTwo extends Thread {

    private int value;

    public ThreadTwo(int v) {
        value = v;
    }

    public void run() {
        while (this.value >= 0) {
            System.out.print("*** The tread" + Thread.currentThread().getName() +
                    "start with " + this.value+"\n");
            while (this.value >= 0) {
                System.out.print("From " + Thread.currentThread().getName() +
                        "value :" + this.value+"\n");
                this.value -= 1;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
            System.out.println("*** The thread" + Thread.currentThread().getName() +
                    " has finished");
        }
    }
}
