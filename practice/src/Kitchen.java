public class Kitchen {
    Order prepareOrder(Order order) {
        System.out.println(order.toString() + "(/s) is/are being prepared");
        order.isCooked();
        System.out.println(order.toString() + "(/s) is/are ready");
        return order;
    }

    @Override

    public Kitchen run(Order order) {
       return prepareOrder(order);
    }
}
