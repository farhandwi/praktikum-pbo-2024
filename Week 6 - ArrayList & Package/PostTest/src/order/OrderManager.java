package order;

import menu.MenuItem;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void createOrder(String orderId) {
        orders.add(new Order(orderId));
    }

    public void addMenuItemToOrder(String orderId, MenuItem item) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                order.addMenuItem(item);
                break;
            }
        }
    }

    public void removeOrder(String orderId) {
        orders.removeIf(order -> order.getOrderId().equals(orderId));
    }

    public ArrayList<Order> getOrders() {
        return new ArrayList<>(orders); // Return a copy to avoid external modifications
    }
}
