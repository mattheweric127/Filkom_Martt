import java.util.ArrayList;
import java.util.Scanner;

public class TugasPraktik10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[][] kereta = {
            {"Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5%", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };

        ArrayList<String> pesanan = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Lihat semua kereta");
            System.out.println("2. Lihat kereta dengan AC");
            System.out.println("3. Lihat kereta dengan Colokan");
            System.out.println("4. Pesan tiket");
            System.out.println("5. Lihat pesanan");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){

                case 1:
                for (String[] k : kereta){
                    System.out.printf("%-12s | Harga: %-8s | Diskon: %-5s | AC: %-10s | Colokan: %-10s%n", k[0], k[1], k[2], k[3], k[4]);
                }
                break;

                case 2:
                for (String[] k : kereta){
                    if (k[3].equalsIgnoreCase("Ada")){
                        System.out.printf("%-12s | Harga : %-8s%n", k[0], k[1]);
                    }
                }
                break;

                case 3:
                for (String[] k : kereta){
                    if(k[4].equalsIgnoreCase("Ada")){
                        System.out.printf("%-12s | Harga : %-8s%n", k[0], k[1]);
                    }
                }
                break;

                case 4:
                    System.out.print("Masukkan Tiket Yang Ingin Dipesan: ");
                    String tiket = input.nextLine();
                    boolean ada = false;
                    for (String[] k : kereta){
                        if (k[0].equalsIgnoreCase(tiket)) {
                            pesanan.add(k[0]);
                            System.out.println("Pesanan " + k[0] + " berhasil!");
                            ada = true;
                            break;
                        }
                    }
                    if (!ada){
                        System.out.println("Kereta tidak ditemukan.");
                    }
                    break;

                case 5:
                    if (pesanan.isEmpty()){
                        System.out.println("Belum ada pesanan");
                    }
                    else {
                        for (String p : pesanan){
                            System.out.println("Pesanan : "+p);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}