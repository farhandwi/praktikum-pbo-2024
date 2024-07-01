import model.Buku;
import model.Anggota;
import model.Transaksi;
import service.PerpustakaanService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat instance dari PerpustakaanService
        PerpustakaanService service = new PerpustakaanService();

        // Menambahkan beberapa buku
        service.tambahBuku(new Buku("B001", "Harry Potter", "J.K. Rowling", 1997));
        service.tambahBuku(new Buku("B002", "Sherlock Holmes", "Arthur Conan Doyle", 1887));
        service.tambahBuku(new Buku("B003", "Lord of the Rings", "J.R.R. Tolkien", 1954));

        // Menambahkan beberapa anggota
        service.tambahAnggota(new Anggota("A001", "John Doe", "Jl. Raya 123", "08123456789"));
        service.tambahAnggota(new Anggota("A002", "Jane Doe", "Jl. Raya 456", "087654321"));

        // Menambahkan transaksi peminjaman
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date tanggalPinjam1 = sdf.parse("2024-04-10");
            Date tanggalKembali1 = sdf.parse("2024-04-17");
            Transaksi transaksi1 = new Transaksi("T001", service.getDaftarBuku().get(0), service.getDaftarAnggota().get(0), tanggalPinjam1, tanggalKembali1);
            service.tambahTransaksi(transaksi1);

            Date tanggalPinjam2 = sdf.parse("2024-04-12");
            Date tanggalKembali2 = sdf.parse("2024-04-19");
            Transaksi transaksi2 = new Transaksi("T002", service.getDaftarBuku().get(1), service.getDaftarAnggota().get(1), tanggalPinjam2, tanggalKembali2);
            service.tambahTransaksi(transaksi2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Menampilkan total buku, anggota, dan transaksi
        System.out.println("Total Buku: " + service.getTotalBuku());
        System.out.println("Total Anggota: " + service.getTotalAnggota());
        System.out.println("Total Transaksi: " + service.getTotalTransaksi());

        // Menghitung dan menampilkan durasi peminjaman
        if (service.getTotalTransaksi() > 0) {
            Transaksi transaksi = service.getDaftarTransaksi().get(0);
            long durasiPeminjaman = service.hitungDurasiPeminjaman(transaksi);
            System.out.println("Durasi Peminjaman " + transaksi.getIdTransaksi() + ": " + durasiPeminjaman + " hari");
        }
    }
}
