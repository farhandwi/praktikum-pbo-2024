package menu;

import java.util.ArrayList;
import java.util.List;

public class MenuDatabase {
    private ArrayList<MenuItem> items;

    public MenuDatabase() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        for (MenuItem menuItem : items) {
            if (menuItem.getId().equals(item.getId())) {
                System.out.println("Item with this ID already exists.");
                return;
            }
        }
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String id) {
        items.removeIf(item -> item.getId().equals(id));
    }

    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(items); // Return a copy to avoid external modifications
    }
}
