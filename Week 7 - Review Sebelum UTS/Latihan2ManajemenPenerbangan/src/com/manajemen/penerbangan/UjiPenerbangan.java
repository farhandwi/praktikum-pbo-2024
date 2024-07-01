package com.manajemen.penerbangan;

import static com.manajemen.penerbangan.ManajemenPenerbangan.getTotalPenerbangan;

import java.util.ArrayList;

public class UjiPenerbangan {
    public static void main(String[] args) {
        ManajemenPenerbangan manajer = new ManajemenPenerbangan();
        manajer.tambahPenerbangan(new Penerbangan("QZ302", "Jakarta", "Bali", "06:00", "scheduled"));
        manajer.tambahPenerbangan(new Penerbangan("GA223", "Jakarta", "Singapore", "09:30", "delayed"));

        System.out.println("Total penerbangan: " + ManajemenPenerbangan.getTotalPenerbangan());

        Penerbangan p = manajer.cariPenerbangan("GA223");
        if (p != null) {
            System.out.println("Penerbangan ditemukan: " + p.getKodePenerbangan() + " - " + p.getStatus());
        } else {
            System.out.println("Penerbangan tidak ditemukan.");
        }

        ArrayList<Penerbangan> delayed = manajer.filterPenerbangan("delayed");
        System.out.println("Penerbangan yang Delayed:");
        for (Penerbangan d : delayed) {
            System.out.println(d.getKodePenerbangan() + " - " + d.getKotaAsal() + " ke " + d.getKotaTujuan());
        }
    }
}
