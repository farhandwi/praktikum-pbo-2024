package com.toko;

public class TesToko {
    public static void main(String[] args) {
        TokoBuku toko = new TokoBuku();
        toko.tambahBuku(new Buku("Java Pemula", "John Doe", 150000, 50));
        toko.tambahBuku(new Buku("Advanced Java", "Jane Roe", 200000, 20));

        System.out.println("Total buku saat ini: " + TokoBuku.getTotalBuku());
        toko.jualBuku("Java Pemula", 10);
        toko.tampilkanStokBatas(15);
    }
}