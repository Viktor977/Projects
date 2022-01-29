package WorkWithThreads;

public class OneThread extends Thread {
    public static Object LockOne;
    public static Object LockTwo;

    public void run() {
        synchronized (LockOne) {
            System.out.print("OneThread is holding LockOne\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("OneThread is waiting for LockTwo\n");
        }
        synchronized (LockTwo) {
            System.out.println("OneThread is holding LockTwo\n");
        }
    }


    public static class TwoThread extends Thread {


        public void run() {
            synchronized (LockOne) {
                System.out.print("TwoThread is holding LockOne\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("TwoThread is waiting for LockTwo\n");
            }
            synchronized (LockTwo) {
                System.out.println("TwoThread is holding LockTwo\n");
            }
        }
    }
}