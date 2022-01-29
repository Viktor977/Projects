package Shop;

public class Customer implements Runnable {

    private final Warehouse house;

    public Customer(Warehouse house) {
        this.house = house;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                house.decreaseQueue();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
