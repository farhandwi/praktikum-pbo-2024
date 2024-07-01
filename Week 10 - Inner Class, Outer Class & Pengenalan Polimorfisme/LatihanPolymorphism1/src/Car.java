public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, String model, int year, int numberOfSeats) {
        super(brand, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public double calculateRentalCost() {
        return super.calculateRentalCost() + (numberOfSeats * 2); // Biaya tambahan berdasarkan jumlah kursi
    }
}
