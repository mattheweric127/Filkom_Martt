package oop2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("NIM Mahasiswa : ");
        String nimMhs = input.nextLine();
        System.out.println("Nama Mahasiswa : ");
        String namaMhs = input.nextLine();

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = nimMhs;
        mhs1.nama = namaMhs;

        System.out.println("Kode MK : ");
        String kMk = input.nextLine();
        System.out.println("Nama MK : ");
        String namaMK = input.nextLine();

        MataKuliah mk1 = new MataKuliah();
        mk1.kode = kMk;
        mk1.nama = namaMK;
        
        KRS krs1 = new KRS();
        krs1.semester = "Genap";
        krs1.tahun = 2025;

    }
}
