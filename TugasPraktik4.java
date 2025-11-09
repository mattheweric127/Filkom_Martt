import java.util.Scanner;

public class TugasPraktik4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b;
        double t;
        double imt;
        System.out.printf("%-15s : ","Masukkan Berat Anda (Kg) ");
        b = input.nextDouble();
        System.out.printf("%-20s : ","Masukkan Tinggi Anda (m) ");
        t = input.nextDouble();
        imt = b/(t*t);
        System.out.print("IMT = "+imt);
        if (imt >30){
            System.out.println("  Termasuk Kegemukan");
        }
        else if (imt>25 && imt<=30){
            System.out.println("  Termasuk Gemuk");
        }
        else if (imt<=25 && imt>18.5){
            System.out.println("  Termasuk Normal");
        }
        else if (imt<=18.5){
            System.out.println("  Termasuk Kurus");
        }
        else{
            System.out.println("Tidak ada data");
        }
    }
}