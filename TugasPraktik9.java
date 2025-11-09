import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TugasPraktik9{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> data = new ArrayList<>();
        int pilihan;
        while(true) { 
            System.out.println("Menu : ");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.println("Masukkan Inputan : ");
            pilihan = input.nextInt();

        
            switch (pilihan) {
                case 1:
                System.out.println("Masukkan Data : ");
                int angka = input.nextInt();
                data.add (angka);
                break;

                case 2:
                System.out.println(data);
                break;

                case 3:
                if (data.isEmpty()){
                    System.out.println("Data Kosong");
                }
                else {
                    double sum = 0;
                    for (int n : data) sum+=n;
                    double avg = sum/data.size();
                    System.out.println("Rata - Rata : "+avg);
                }
                break;

                case 4:
                if (data.isEmpty()){
                    System.out.println("Data Kosong");
                }
                else {
                    int sum = 0;
                    for (int n : data) sum+=n;
                    System.out.println("Jumlah : "+sum);
                }
                break;

                case 5:
                if (data.isEmpty()){
                    System.out.println("Data Kosong");
                }
                else {
                    int max = Collections.max(data);
                    System.out.println("Nilai Terbesar : "+max);
                }
                break;

                case 6:
                if (data.isEmpty()){
                    System.out.println("Data Kosong");
                }
                else {
                    int min = Collections.min(data);
                    System.out.println("Nilai Terkecil : "+min);
                }
                break;

                case 0:
                System.out.println("Program Selesai");
                return;

                default:
                System.out.println("Inputan Anda Tidak Valid");
                return;
                
            }
        }
    }
}
