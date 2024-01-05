import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Simulation {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Scanner scanner = new Scanner(System.in);

        List<Order> order = new ArrayList<>();
        int counter = 0;

        order.add(new Order(1,"Chicken soup"));
        order.add(new Order(2,"Spaghetti with Ketchup"));
        order.add(new Order(5,"Fruit salad"));


        for (Order orders : order) {
            Runnable waiters = new Waiter(order.get(counter));
            counter++;
            waiters.run();
        }
    }
}