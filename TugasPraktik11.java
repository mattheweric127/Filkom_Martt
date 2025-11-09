import java.util.Scanner;

public class TugasPraktik11 {
    
    static int faktorial(int n){
        int hasil = 1;
        for(int i=1;i<=n;i++){
            hasil *= i;
        }
        return hasil;
    }

    static int permutasi(int n,int r){
        return faktorial(n)/faktorial(n-r);
    }

    static int kombinasi(int n,int r){
        return faktorial(n)/(faktorial(n-r)*faktorial(r));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan;

        do { 
            System.out.println("Program Menghitung Permutasi dan Kombinasi");
            System.out.println("1. Meenghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();

            if(pilihan==1){
                System.out.print("Masukkan nilai n : ");
                int n = input.nextInt();
                System.out.print("Masukkan niali r : ");
                int r = input.nextInt();
                
                int hasil = permutasi(n,r);
                System.out.println("\nnPr = n! / (n-r)!");
                System.out.println("Maka Hasil Permutasinya adalah: " + hasil);
            }
            else if(pilihan==2){
                System.out.print("Masukkan nilai n : ");
                int n = input.nextInt();
                System.out.print("Masukkan niali r : ");
                int r = input.nextInt();
                
                int hasil = kombinasi(n,r);
                System.out.println("\nnPr = n! / ((n-r)!*r!)");
                System.out.println("Maka Hasil Kombinasinya adalah: " + hasil);
            }
            else if(pilihan==3){
                System.out.println("Program Selesai");
                break;
            }
            else{
                System.out.println("Pilihan Anda Tidak Valid");
            }
        } while (pilihan !=3);
    }
}
