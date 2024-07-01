class Karyawan {
    private String nama;
    private String idKaryawan;
    private double gajiPokok;
    private double bonus;
    private double potongan;

    public Karyawan(String nama, String idKaryawan, double gajiPokok) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
        } else {
            System.out.println("Error: Gaji pokok tidak boleh negatif.");
            this.gajiPokok = 0;
        }
        this.bonus = 0;
        this.potongan = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public double hitungGajiBersih() {
        return gajiPokok + bonus - potongan;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }
}

public class ManajemenGaji {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("John Doe", "K001", 5000);
        Karyawan karyawan2 = new Karyawan("Jane Doe", "K002", 6000);

        karyawan1.setBonus(1000);
        karyawan1.setPotongan(500);
        karyawan2.setBonus(1500);
        karyawan2.setPotongan(600);

        System.out.println("Data Karyawan:");
        System.out.println("ID Karyawan\tNama\tGaji Bersih");
        System.out.println("---------------------------------");
        System.out.println(karyawan1.getIdKaryawan() + "\t\t" + karyawan1.getNama() + "\t" + karyawan1.hitungGajiBersih());
        System.out.println(karyawan2.getIdKaryawan() + "\t\t" + karyawan2.getNama() + "\t" + karyawan2.hitungGajiBersih());
    }
}
