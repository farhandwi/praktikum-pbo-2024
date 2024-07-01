public class Television extends ElectronicDevice {
    private int screenSize;

    public Television(String brand, String model, int screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Television is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is now OFF.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Television Info: Brand - " + brand + ", Model - " + model + ", Screen Size - " + screenSize + " inches");
    }
}