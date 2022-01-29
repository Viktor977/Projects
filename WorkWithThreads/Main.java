package WorkWithThreads;

import Threads.ThreadOne;

public class Main {

    public static void main(String[] args) {
        OneThread.LockOne = new Object();
        OneThread.LockTwo = new Object();
        OneThread one = new OneThread();
        OneThread.TwoThread two = new OneThread.TwoThread();
        one.start();
        two.start();
    }
}
