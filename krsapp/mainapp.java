package krsapp;

import java.util.Scanner;

public class mainapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        mahasiswa mhs = new mahasiswa(nim, nama);
        krs krsObj = new krs(mhs);

        System.out.println("\n=== Input Mata Kuliah ===");

        while (true) {
            System.out.print("Kode MK   : ");
            String kode = input.nextLine();
            System.out.print("Nama MK   : ");
            String namaMK = input.nextLine();
            System.out.print("SKS       : ");
            int sks = input.nextInt();
            input.nextLine(); // bersihkan buffer

            matakuliah mk = new matakuliah(kode, namaMK, sks);
            krsObj.tambahMataKuliah(mk);

            System.out.print("Tambah MK lagi? (y/n) : ");
            String pilih = input.nextLine();
            if (pilih.equalsIgnoreCase("n")) break;
        }

        krsObj.cetakKRS();
    }
}
