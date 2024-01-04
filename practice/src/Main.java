import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Scanner scanner = new Scanner(System.in);

        List<Order> order = new ArrayList<>();
        Runnable  kitchen = new Kitchen();
        Waiter waiters = new Waiter();

        boolean isOpen = true;

        order.add(new Order(1,"Chicken soup"));
        order.add(new Order(2,"Spaghetti with Ketchup"));
        order.add(new Order(5,"Fruit salad"));

        while (isOpen = true){
            System.out.println("hgerg");
        }
    }
}