import java.util.Scanner;

public class TugasPraktik5{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jam_kerja;
        int upah;
        int lembur;
        int denda;
        int total;
        int a;
        int b;
        System.out.print("Masukkan Total Jam Kerja : ");
        jam_kerja = input.nextInt();
        System.out.printf("%-15s = %d%n","Jam Kerja ",jam_kerja);
        a=jam_kerja-60;
        b=50-jam_kerja;
        if (jam_kerja>60){
            upah = 5000*60;
            System.out.printf("%-15s = Rp. %d%n","Upah ",upah);
            lembur = a*6000;
            System.out.printf("%-15s = Rp. %d%n","Lembur ",lembur);
            denda=0;
            System.out.printf("%-15s = Rp. %d%n","Denda ",denda);
            System.out.println("---------------------");
            total = upah+lembur-denda;
            System.out.printf("%-15s = Rp. %d%n","Total ",total);
        }
        else if (jam_kerja>50 && jam_kerja <= 60){
            upah = 5000*jam_kerja;
            System.out.printf("%-15s = Rp. %d%n","Upah ",upah);
            lembur=0;
            System.out.printf("%-15s = Rp. %d%n","Lembur ",lembur);
            denda=0;
            System.out.printf("%-15s = Rp. %d%n","Denda ",denda);
            System.out.println("---------------------");
            total = upah+lembur-denda;
            System.out.printf("%-15s = Rp. %d%n","Total ",total);
        }
        else {
            upah = 5000*jam_kerja;
            System.out.printf("%-15s = Rp. %d%n","Upah ",upah);
            lembur=0;
            System.out.printf("%-15s = Rp. %d%n","Lembur ",lembur);
            denda=b*1000;
            System.out.printf("%-15s = Rp. %d%n","Denda ",denda);
            System.out.println("---------------------");
            total = upah+lembur-denda;
            System.out.printf("%-15s = Rp. %d%n","Total ",total);
        }
    }
}