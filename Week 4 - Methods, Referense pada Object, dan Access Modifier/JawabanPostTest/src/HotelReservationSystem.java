class Room {
    private int roomNumber;
    private String roomType;
    private boolean occupied;
    private double rate;

    public Room() {
        this(0, "Standard", false, 100.0);
        System.out.println("Default Constructor of Room is called.");
    }

    public Room(int roomNumber, String roomType) {
        this(roomNumber, roomType, false, roomType.equals("Deluxe") ? 200.0 : 100.0);
        System.out.println("Constructor of Room with roomNumber and roomType is called.");
    }

    public Room(int roomNumber, String roomType, boolean occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
        System.out.println("Constructor of Room with all parameters is called.");
    }

    // Getters and setters
    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public boolean isOccupied() { return occupied; }
    public double getRate() { return rate; }

    // Assuming setters are needed for some operations
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
    public void setRate(double rate) { this.rate = rate; }
}


class Hotel {
    private String name;
    private Room[] rooms;

    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {
            rooms[i] = new Room(i + 1, "Standard");
        }
        System.out.println("Constructor of Hotel with name and numberOfRooms is called.");
    }

    public Hotel(String name, int numberOfStandardRooms, int numberOfDeluxeRooms) {
        this.name = name;
        int totalRooms = numberOfStandardRooms + numberOfDeluxeRooms;
        this.rooms = new Room[totalRooms];
        for (int i = 0; i < totalRooms; i++) {
            if (i < numberOfStandardRooms) {
                rooms[i] = new Room(i + 1, "Standard");
            } else {
                rooms[i] = new Room(i + 1, "Deluxe");
            }
        }
        System.out.println("Constructor of Hotel with name, numberOfStandardRooms, and numberOfDeluxeRooms is called.");
    }

    // Getters
    public String getName() { return name; }
    public Room[] getRooms() { return rooms; }
}


class Reservation {
    private Room reservedRoom;
    private String guestName;
    private int numberOfNights;
    private double totalCharge;

    public Reservation(Room reservedRoom, String guestName, int numberOfNights) {
        this.reservedRoom = reservedRoom;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
        this.totalCharge = reservedRoom.getRate() * numberOfNights;
        System.out.println("Constructor of Reservation is called.");
    }

    // Getters
    public Room getReservedRoom() { return reservedRoom; }
    public String getGuestName() { return guestName; }
    public int getNumberOfNights() { return numberOfNights; }
    public double getTotalCharge() { return totalCharge; }
}


public class HotelReservationSystem {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Grand Hotel", 2);
        Hotel hotel2 = new Hotel("Seaside Resort", 2, 2);

        Room room101 = hotel1.getRooms()[0]; // Misalkan mengambil kamar pertama dari hotel1
        Reservation reservation1 = new Reservation(room101, "John Doe", 3);

        System.out.println("Reservation for " + reservation1.getGuestName() + " in " + room101.getRoomType() +
                " room for " + reservation1.getNumberOfNights() + " nights. Total charge: $" +
                reservation1.getTotalCharge());
    }
}
