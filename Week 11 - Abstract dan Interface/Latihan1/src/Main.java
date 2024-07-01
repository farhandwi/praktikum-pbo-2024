public class Main {
    public static void main(String[] args) {
        ElectronicDevice tv = new Television("Sony", "Bravia", 55);
        ElectronicDevice fridge = new Refrigerator("Samsung", "CoolTech", 300);

        tv.turnOn();
        tv.displayInfo();
        tv.turnOff();

        System.out.println();

        fridge.turnOn();
        fridge.displayInfo();
        fridge.turnOff();
    }
}
