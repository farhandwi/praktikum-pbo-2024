package com.toko;

import java.util.ArrayList;

public class TokoBuku {
    private ArrayList<Buku> buku;
    private static int totalBuku = 0;

    public TokoBuku() {
        this.buku = new ArrayList<>();
    }

    public void tambahBuku(Buku bukuBaru) {
        buku.add(bukuBaru);
        totalBuku++;
    }

    public void jualBuku(String judul, int jumlah) {
        for (Buku b : buku) {
            if (b.getJudul().equals(judul) && b.getStok() >= jumlah) {
                b.setStok(b.getStok() - jumlah);
                break;
            }
        }
    }

    public void tampilkanStokBatas(int batas) {
        System.out.println("Daftar Buku dengan Stok di Atas " + batas + ":");
        for (Buku b : buku) {
            if (b.getStok() > batas) {
                System.out.println(b.getJudul() + " - Stok: " + b.getStok());
            }
        }
    }

    public static int getTotalBuku() {
        return totalBuku;
    }
}
