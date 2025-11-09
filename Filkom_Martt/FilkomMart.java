package Filkom_Martt;
import java.util.Scanner;

public class FilkomMart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Berapa barang yang mau dibeli : ");
        int n = input.nextInt();
        input.nextLine(); // <--- tambahkan ini untuk “membersihkan” newline

        Barang[] barangs = new Barang[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nama Barang: ");
            String nama = input.nextLine();  // pakai nextLine biar aman

            System.out.print("Masukkan Harga: ");
            int harga = Integer.parseInt(input.nextLine()); // parse dari String

            System.out.print("Masukkan Jumlah: ");
            int jumlah = Integer.parseInt(input.nextLine());

            Barang b = new Barang(); // INSTANSIASI
            b.nama = nama;
            b.harga = harga;
            b.jumlah = jumlah;
            b.total = b.harga * b.jumlah;

            barangs[i] = b;
        }

        cetak(barangs);
    }

    public static void cetak(Barang[] barangs) {
        System.out.println("\nNama\tHarga\tJumlah\tTotal");
        System.out.println("---------------------------------");
        for (Barang b : barangs) {
            System.out.println(b.nama + "\t" + b.harga + "\t" + b.jumlah + "\t" + b.total);
        }
    }
}
