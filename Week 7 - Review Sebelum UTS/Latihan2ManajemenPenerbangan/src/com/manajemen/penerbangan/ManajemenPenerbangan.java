package com.manajemen.penerbangan;

import java.util.ArrayList;

public class ManajemenPenerbangan {
    private ArrayList<Penerbangan> penerbangan;
    private static int totalPenerbangan;

    public ManajemenPenerbangan() {
        this.penerbangan = new ArrayList<>();
    }

    public void tambahPenerbangan(Penerbangan baru) {
        penerbangan.add(baru);
        totalPenerbangan++;
    }

    public Penerbangan cariPenerbangan(String kode) {
        for (Penerbangan p : penerbangan) {
            if (p.getKodePenerbangan().equals(kode)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Penerbangan> filterPenerbangan(String status) {
        ArrayList<Penerbangan> hasil = new ArrayList<>();
        for (Penerbangan p : penerbangan) {
            if (p.getStatus().equals(status)) {
                hasil.add(p);
            }
        }
        return hasil;
    }

    public static int getTotalPenerbangan() {
        return totalPenerbangan;
    }
}
