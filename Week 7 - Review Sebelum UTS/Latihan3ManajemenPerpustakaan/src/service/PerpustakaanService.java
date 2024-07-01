package service;

import model.Buku;
import model.Anggota;
import model.Transaksi;
import util.DateUtil;

import java.util.ArrayList;
import java.util.Date;

public class PerpustakaanService {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    private static int totalBuku = 0;
    private static int totalAnggota = 0;
    private static int totalTransaksi = 0;

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        totalBuku++;
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        totalAnggota++;
    }

    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
        totalTransaksi++;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public ArrayList<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    public int getTotalBuku() {
        return totalBuku;
    }

    public int getTotalAnggota() {
        return totalAnggota;
    }

    public int getTotalTransaksi() {
        return totalTransaksi;
    }

    public long hitungDurasiPeminjaman(Transaksi transaksi) {
        return DateUtil.selisihHari(transaksi.getTanggalPinjam(), transaksi.getTanggalKembali());
    }
}
