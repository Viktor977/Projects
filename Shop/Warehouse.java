package Shop;

import java.util.Queue;

public class Warehouse {
    private final Queue queue;

    public Warehouse(Queue queue) {
        this.queue = queue;
    }

    public synchronized void increaseQueue() throws InterruptedException {
        if (queue.size() == 10) {

            System.out.println("Seller is waiting");
            wait();
            System.out.println("Seller is  notifying");
        }
        System.out.println("Seller sells one product");

        queue.add(new Object());
        notify();
    }

    public synchronized void decreaseQueue() throws InterruptedException {
        if (queue.size() == 0) {
            System.out.println("Customer is waiting");
            wait();
            System.out.println("Customer is  notifying");
        }
        System.out.println("Customer bought one product");

        queue.poll();
        notify();
    }
}
