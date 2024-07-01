public class Refrigerator extends ElectronicDevice {
    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is now OFF.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Refrigerator Info: Brand - " + brand + ", Model - " + model + ", Capacity - " + capacity + " liters");
    }
}