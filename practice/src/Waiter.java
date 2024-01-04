public class Waiter {
    void takeOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being ordered");
        order.setTaken(true);
    }
    void serveOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being served");
        order.setServed(true);
        System.out.println(order.toString() + "(/s) is/are id served. Enjoy");
    }
}
