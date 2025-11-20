package Peminjaman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM   : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        System.out.println();
        System.out.print("Berapa buku yang ingin dipinjam? ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nBuku ke-" + i);
            System.out.print("Masukkan ISBN  : ");
            String isbn = input.nextLine();

            System.out.print("Masukkan Judul : ");
            String judul = input.nextLine();

            Buku buku = new Buku(isbn, judul);
            mhs.pinjam(buku);
        }

        System.out.println("\n======================================================");
        System.out.println("NIM   : " + mhs.getNim());
        System.out.println("Nama  : " + mhs.getNama());
        System.out.println("------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-50s |\n", "No", "ISBN", "Judul");
        System.out.println("------------------------------------------------------");

        int no = 1;
        for (Buku b : mhs.getDaftarPinjaman()) {
            System.out.printf("| %-3d | %-30s | %-50s |\n",
                    no, b.getIsbn(), b.getJudul());
            no++;
        }

        System.out.println("------------------------------------------------------");
    }

}
