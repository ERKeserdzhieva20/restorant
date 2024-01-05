public class Kitchen extends Thread{
    Order order;

    public Kitchen(Order order) {
        this.order = order;
    }

    Order prepareOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being prepared");
        order.isCooked();
        System.out.println(order.toString() + "(/s) is/are ready");
        return order;
    }

    //@Override
    public void run() {
        prepareOrder(order);
    }
}
