package model;

import java.util.Date;

public class Transaksi {
    private String idTransaksi;
    private Buku buku;
    private Anggota anggota;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Transaksi(String idTransaksi, Buku buku, Anggota anggota, Date tanggalPinjam, Date tanggalKembali) {
        this.idTransaksi = idTransaksi;
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
}
