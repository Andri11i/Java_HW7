
import java.util.*;
class CoffeeOrderBoard {
    private final List<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.nextOrderNumber = 1;
    }


    public void add(String name) {
        Order order = new Order(nextOrderNumber++, name);
        orders.add(order);
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            System.out.println("No orders to deliver.");
            return null;
        }
        return orders.remove(0);
    }


    public Order deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getNumber() == orderNumber) {
                return orders.remove(i);
            }
        }
        System.out.println("Order number " + orderNumber + " not found.");
        return null;
    }



    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}