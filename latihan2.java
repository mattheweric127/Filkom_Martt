import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();

        while(angka>=10){
            int jumlah = 0;
            while (angka>0){
                 jumlah += angka%10;
                 angka /=10 ;   
            }
            angka=jumlah;
        }
        System.out.print (angka);
        input.close();
    }
    
}
