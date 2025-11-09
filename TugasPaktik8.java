import java.util.Scanner;

public class TugasPaktik8{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Menu");
        System.out.println("0. Keluar");
        System.out.println("1. Hitung Volume Balok");
        System.out.println("2. Hitung Volume Bola");
        System.out.println("3. Hitung Volume Kerucut");
        System.out.println("4. Hitung Volume Silinder");
        System.out.println("5. Hitung Volume Limas Segitiga");
        
        while(true){
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();
        
            if (pilihan==0){
                System.out.println("Terima Kasih, Program Selesai");
                break;
            }
            else if (pilihan == 1){
                System.out.print("Masukkan Panjang : ");
                int panjang = input.nextInt();
                System.out.print("Masukkan Lebar : ");
                int lebar = input.nextInt();
                System.out.print("Masukkan Tinggi : ");
                int tinggi = input.nextInt();
                
                int volume = panjang*lebar*tinggi;
                System.out.println("Volume Balok : "+volume+" cm3");
            }
            else if (pilihan==2){
                System.out.print("Masukkan Jari - Jari : ");
                double jari2 = input.nextDouble();
                double volume  = (4.0/3)*3.14*jari2*jari2*jari2;
                System.out.println("Volume Bola : "+volume+" cm3");
            }
            else if (pilihan == 3){
                System.out.print("Masukkan Tinggi : ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan Jari - Jari : ");
                double jari2 = input.nextDouble();
                double volume  = (1.0/3)*3.14*jari2*jari2*tinggi;
                System.out.println("Volume Kerucut : "+volume +" cm3");
            }
            else if (pilihan == 4){
                System.out.print("Masukkan Jari - Jari : ");
                double jari2 = input.nextDouble();
                System.out.print("Masukkan Tinggi : ");
                double tinggi = input.nextDouble();
                double volume = 3.14*jari2*jari2*tinggi;
                System.out.println("Volume Silinder : "+volume +" cm3");
            }
            else if (pilihan ==5){
                System.out.print("Masukkan Tinggi Limas : ");
                int t2 = input.nextInt();
                System.out.print("Masukkan Alas (Luas Alas) : ");
                int la1 = input.nextInt();
                System.out.print("Masukkan Tinggi (Luas Alas) : ");
                int t1 = input.nextInt();
                double la2 = (1.0/2)*la1*t1;
                double volume = (1.0/3)*la2*t2;
                System.out.println("Volume Limas Segitiga  : "+volume+" cm3");
            }
            else{
                System.out.println("Pilihan Yang Anda Inginkan Tidak Tersedia");
            }
        }
    }
}