package util;

public class IDGenerator {
    private static int menuIdCounter = 0;
    private static int orderIdCounter = 0;

    public static String generateMenuId() {
        return "M" + (++menuIdCounter);
    }

    public static String generateOrderId() {
        return "O" + (++orderIdCounter);
    }
}
