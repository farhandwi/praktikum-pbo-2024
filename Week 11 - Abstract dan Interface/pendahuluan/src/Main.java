interface Kendaraan {
    void start();

    void stop();
}

abstract class Mobil implements Kendaraan {
    void bensin() {
        System.out.println("Mobil mengisi bensin");
    }
}

class Sedan extends Mobil {
    public void jalan() {
        System.out.println("Sedan berjalan");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Sedan sedan = new Sedan();
        sedan.bensin();
        sedan.jalan();
        sedan.start();
        sedan.stop();
    }
}
