 import java.util.Scanner;

public class TugasPraktik1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double op1;
        double op2;
        System.out.println("Masukkan Operator Pertama : ");
        op1 = input.nextDouble();
        System.out.println("Masukkan Operator Kedua : ");
        op2 = input.nextDouble();
        double jumlah  = op1+op2;
        double kurang = op1-op2;
        double kali = op1*op2;
        double bagi = op1/op2;
        System.out.printf("%-30s : %.0f %n","Hasil Penjumlahan",jumlah);
        System.out.printf("%-30s : %.0f %n","Hasil Pengurangan",kurang);
        System.out.printf("%-30s : %.0f %n","Hasil Perkalian",kali);
        System.out.printf("%-30s : %.1f %n","Hasil Pembagian",bagi);
       input.close();
        
    }
}