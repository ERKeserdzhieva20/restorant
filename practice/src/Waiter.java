import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.Scanner;
import java.util.concurrent.Executors;

public class Waiter extends Thread{
    ExecutorService executor = Executors.newFixedThreadPool(2);
    Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    void takeOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being ordered");
        order.setTaken(true);
    }
    void serveOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being served");
        //System.out.println(order.isServed() +" " + order.isTaken());
        order.setServed(true);
        System.out.println(order.toString() + "(/s) is/are id served. Enjoy");
    }

    //@Override

    public void run() {

        takeOrder(order);
        Kitchen kitchen = new Kitchen(order);
        kitchen.run();
        //wait();
        executor.execute(kitchen);
        serveOrder(order);

    }
}
