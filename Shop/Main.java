package Shop;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Warehouse house=new Warehouse(new LinkedList());

       Thread customer=new Thread(new Customer(house));
       Thread seller= new Thread(new Seller(house));

       customer.start();
       seller.start();
       Thread.sleep(20000);
       customer.interrupt();
       seller.interrupt();

    }
}
