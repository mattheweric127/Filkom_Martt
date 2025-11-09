import java.util.Arrays;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka 1 : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        int b = input.nextInt(); 
        System.out.print("Masukkan Angka 3 : ");
        int c = input.nextInt();
         System.out.print("Masukkan Angka 4 : ");
        int d = input.nextInt();

        int[] angka = {a,b,c,d};
        Arrays.sort(angka);
        for (int i=0;i<angka.length;i++){
            System.out.print(angka[i]+" ");
        }

    }

}
