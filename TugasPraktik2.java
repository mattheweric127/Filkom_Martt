import java.util.Scanner;
        
public class TugasPraktik2{
    public static void main(String[] args) {
        System.out.println("Program Penghitung Pemakaian Listrik Sederhana");
        Scanner input = new Scanner (System.in);
        System.out.printf("%-40s : ","Masukkan Nama ");
        String nama = input.nextLine();
        System.out.printf("%-40s : ","Masukan Nama Kelurahan ");
        String lurah = input.nextLine();
        System.out.printf("%-40s : ","Masukkan Posisi Awal Kwh Meter");
        int awal = input.nextInt();
        System.out.printf("%-40s : ","Masukkan Posisi Akhir Kwh Meter");
        int akhir = input.nextInt();
        System.out.printf("%-40s : ","Masukkan Biaya Beban Saat Ini");
        int beban = input.nextInt();
        System.out.printf("%-40s : ","Masukkan PPJ (Dalam Persen)");
        int pajak = input.nextInt();
        int a = akhir-awal;
        int b = beban*a;
        int c = b*pajak/100;
        int d = b+c;
        System.out.println("===================PLN Java===================");
        System.out.printf("%-40s : %s%n","Nama ",nama);
        System.out.printf("%-40s : %s%n","Kelurahan : ",lurah);
        System.out.printf("%-40s : %s%n","Pemakaian Bulan Ini ",a ," KWH Meter");
        System.out.printf("%-40s : Rp %d%s%n","Tarif Listrik : ", b ,",-");
        System.out.printf("%-40s : Rp %d%s%n","PPJ 10% : ", c ,",-");
        System.out.printf("%-40s : Rp %d%s%n","Total Bayar", d ,",-");
        System.out.println("==============================================");
    }
}