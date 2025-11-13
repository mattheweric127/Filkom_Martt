package krsapp;

import java.util.ArrayList;

public class krs {
    private mahasiswa mahasiswaObj;
    private ArrayList<matakuliah> daftarMK;
    private int totalSKS = 0;
    private final int MAKS_SKS = 24;

    public krs(mahasiswa mahasiswaObj) { // constructor sama
        this.mahasiswaObj = mahasiswaObj;
        this.daftarMK = new ArrayList<>();
    }

    public boolean tambahMataKuliah(matakuliah mk) {
        if (totalSKS + mk.getSks() > MAKS_SKS) {
            System.out.println("Gagal menambah MK. Total SKS melebihi batas 24.");
            return false;
        }
        daftarMK.add(mk);
        totalSKS += mk.getSks();
        return true;
    }

    public void cetakKRS() {
        System.out.println("\n===== KARTU RENCANA STUDI =====");
        System.out.println("NIM   : " + mahasiswaObj.getNim());
        System.out.println("Nama  : " + mahasiswaObj.getNama());
        System.out.println("--------------------------------");
        System.out.println("Daftar Mata Kuliah:");

        for (matakuliah mk : daftarMK) {
            System.out.println(mk.getKode() + " - " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }

        System.out.println("--------------------------------");
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("\nTTD KPS: " + mahasiswaObj.getNama());
        System.out.println("================================\n");
    }
}
