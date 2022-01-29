package Shop;

public class Seller extends Thread {

    private final Warehouse house;

    public Seller(Warehouse house) {
        this.house = house;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                house.increaseQueue();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
