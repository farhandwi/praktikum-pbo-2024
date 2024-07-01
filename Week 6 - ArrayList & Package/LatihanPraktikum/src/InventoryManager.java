import java.util.ArrayList;
import java.util.Iterator;

public class InventoryManager {
    private ArrayList<Item> inventory;

    public InventoryManager() {
        inventory = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity, String description) {
        // Validasi harga dan jumlah stok
        if (price <= 0 || quantity < 0) {
            System.out.println("Invalid price or quantity. Item not added.");
            return;
        }

        // Menambahkan barang baru ke dalam inventaris
        Item item = new Item(name, price, quantity, description);
        inventory.add(item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String name) {
        Iterator<Item> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equals(name)) {
                iterator.remove();
                System.out.println("Item removed successfully.");
            }
        }
    }

    public void searchItem(String name) {
        boolean found = false;
        for (Item item : inventory) {
            if (item.getName().equals(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void displayAllItems() {
        if (inventory.isEmpty()) {
            System.out.println("No items available.");
        } else {
            System.out.println("All Items:");
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    }
}
