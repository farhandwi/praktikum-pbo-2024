class Karyawan {
    private String nama;
    private String idKaryawan;
    private double gajiPokok;
    private double bonus;
    private double potongan;

    // Konstruktor
    public Karyawan(String nama, String idKaryawan, double gajiPokok) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.gajiPokok = gajiPokok;
        // Bonus dan potongan diinisialisasi secara default ke 0
        this.bonus = 0;
        this.potongan = 0;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPotongan() {
        return potongan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    // Metode untuk menghitung gaji bersih
    public double hitungGajiBersih() {
        return gajiPokok + bonus - potongan;
    }
}

public class LatihanConstructor {
    public static void main(String[] args) {
        // Membuat objek karyawan
        Karyawan karyawan1 = new Karyawan("Alice", "K001", 5000.0);
        Karyawan karyawan2 = new Karyawan("Bob", "K002", 6000.0);

        // Mengatur bonus dan potongan
        karyawan1.setBonus(500);
        karyawan1.setPotongan(200);
        karyawan2.setBonus(600);
        karyawan2.setPotongan(300);

        // Menampilkan informasi gaji bersih
        System.out.println("ID Karyawan: " + karyawan1.getIdKaryawan() + ", Nama: " + karyawan1.getNama() + ", Gaji Bersih: $" + karyawan1.hitungGajiBersih());
        System.out.println("ID Karyawan: " + karyawan2.getIdKaryawan() + ", Nama: " + karyawan2.getNama() + ", Gaji Bersih: $" + karyawan2.hitungGajiBersih());
    }
}

