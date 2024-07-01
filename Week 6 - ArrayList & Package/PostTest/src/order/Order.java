package order;

import menu.MenuItem;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private ArrayList<MenuItem> orderedItems;

    public Order(String orderId) {
        this.orderId = orderId;
        this.orderedItems = new ArrayList<>();
    }

    void addMenuItem(MenuItem item) {
        orderedItems.add(item);
    }

    public ArrayList<MenuItem> getOrderedItems() {
        return new ArrayList<>(orderedItems); // Return a copy to avoid external modifications
    }

    public String getOrderId() {
        return orderId;
    }
}
