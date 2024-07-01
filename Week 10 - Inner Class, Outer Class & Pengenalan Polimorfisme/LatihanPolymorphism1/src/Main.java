public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota", "Corolla", 2020, 5),
                new Truck("Ford", "F-150", 2018, 2.5),
                new Car("Honda", "Civic", 2019, 4),
                new Truck("Chevrolet", "Silverado", 2021, 3.0)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Number of Seats: " + car.getNumberOfSeats());
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Load Capacity: " + truck.getLoadCapacity() + " tons");
            }
            System.out.println("Rental Cost: $" + vehicle.calculateRentalCost());
            System.out.println();
        }
    }
}
