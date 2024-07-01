import menu.MenuDatabase;
import menu.MenuItem;
import order.Order;
import order.OrderManager;
import util.IDGenerator;

public class Main {
    public static void main(String[] args) {
        // Membuat instance dari MenuDatabase
        MenuDatabase menuDb = new MenuDatabase();

        // Menambahkan beberapa item ke menu
        String menuItemId1 = IDGenerator.generateMenuId();
        String menuItemId2 = IDGenerator.generateMenuId();
        menuDb.addItem(new MenuItem(menuItemId1, "Nasi Goreng", 20000));
        menuDb.addItem(new MenuItem(menuItemId2, "Mie Goreng", 18000));

        // Menampilkan menu
        System.out.println("Menu Items:");
        menuDb.getMenuItems().forEach(item ->
                System.out.println(item.getName() + ": Rp" + item.getPrice()));

        // Membuat order manager
        OrderManager orderManager = new OrderManager();

        // Membuat sebuah order dan menambahkan item ke dalamnya
        String orderId = IDGenerator.generateOrderId();
        orderManager.createOrder(orderId);

        // Mencari item dari database untuk ditambahkan ke order
        MenuItem orderedItem1 = menuDb.getMenuItems().stream()
                .filter(item -> item.getId().equals(menuItemId1))
                .findFirst()
                .orElse(null);

        MenuItem orderedItem2 = menuDb.getMenuItems().stream()
                .filter(item -> item.getId().equals(menuItemId2))
                .findFirst()
                .orElse(null);

        if (orderedItem1 != null && orderedItem2 != null) {
            orderManager.addMenuItemToOrder(orderId, orderedItem1);
            orderManager.addMenuItemToOrder(orderId, orderedItem2);
        }

        // Menampilkan order
        System.out.println("Orders:");
        orderManager.getOrders().forEach(order -> {
            System.out.println("Order ID: " + order.getOrderId());
            order.getOrderedItems().forEach(item ->
                    System.out.println(item.getName() + ": Rp" + item.getPrice()));
        });
    }
}
