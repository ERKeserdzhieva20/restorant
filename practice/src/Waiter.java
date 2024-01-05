import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.Scanner;
import java.util.concurrent.Executors;

public class Waiter extends Thread{
    ExecutorService executor = Executors.newFixedThreadPool(2);
    Order order;
    boolean FinishingOrder;

    public Waiter(Order order) {
        this.order = order;
    }

    void takeOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being ordered");
        order.setTaken(true);
    }
    void serveOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being served");
        order.setServed(true);
        System.out.println(order.toString() + "(/s) is/are id served. Enjoy!!!");
    }

    //@Override

    public synchronized void run() {
            takeOrder(order);
             Runnable kitchen = new Kitchen(order);
            try {
                this.sleep(1000);
                kitchen.run();
            }
            catch(Exception x){

            }
            serveOrder(order);
    }
}
