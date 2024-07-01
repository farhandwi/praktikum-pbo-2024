public abstract class ElectronicDevice implements Switchable {
    protected String brand;
    protected String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void displayInfo();
}
