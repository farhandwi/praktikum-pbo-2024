public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public double calculateRentalCost() {
        return super.calculateRentalCost() + (loadCapacity * 0.5); // Biaya tambahan berdasarkan kapasitas muatan
    }
}
