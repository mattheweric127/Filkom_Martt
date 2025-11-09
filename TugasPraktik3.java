import java.util.Scanner;

public class TugasPraktik3{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan;
        double panjang;
        double lebar;
        double jari2;
        double sisi1;
        double sisi2;
        double sisi3;
        double semiperimeter;
        double luas;
        double keliling;
        System.out.println("Menu : ");
        System.out.println("1.Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("2.Mengh itung Luas dan Keliling Lingkaran");
        System.out.println("3.Menghitung Luas dan Keliling Segitiga");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
            System.out.println("Pilihan Anda : 1");
            System.out.printf("%-25s : ","Masukkan Nilai Panjang ");
            panjang = input.nextDouble();
            System.out.printf("%-25s : ","Masukkan Nilai Lebar ");
            lebar = input.nextDouble();
            luas = panjang*lebar;
            keliling = 2*(panjang+lebar);
            System.out.printf("%-25s : %.2f %s%n","Luas Persegi Panjang " , luas, " cm2");
            System.out.printf("%s : %.2f %s%n","Keliling Persegi Panjang ", keliling, " cm");
            break;
        
            case 2:
            System.out.println("Pilihan Anda : 2");
            System.out.printf("%-25s : ","Masukkan Nilai Jari Jari ");
            jari2 = input.nextDouble();
            luas = 3.14*jari2*jari2;
            keliling = 2*3.14*jari2;
            System.out.printf("%-25s : %.2f %s%n","Luas Lingkaran ", luas, " cm2");
            System.out.printf("%-25s : %.2f %s%n","Keliling lingkaran ", keliling, " cm");
            break;
            
            case 3:
                System.out.println("Pilihan Anda : 3");
                System.out.printf("%-25s : ","Masukkan Nilai Sisi 1 ");
                sisi1 = input.nextDouble();
                System.out.printf("%-25s : ","Masukkan Nilai Sisi 2 ");
                sisi2 = input.nextDouble();
                System.out.printf("%-25s : ","Masukkan Nilai Sisi 3 ");
                sisi3 = input.nextDouble();
                semiperimeter = 0.5*(sisi1+sisi2+sisi3);
                luas = Math.sqrt(semiperimeter*(semiperimeter-sisi1)*(semiperimeter-sisi2)*(semiperimeter-sisi3));
                keliling = sisi1+sisi2+sisi3;
                System.out.printf("%-25s : %.2f %s%n","Luas Segitiga ", luas, " cm2");
                System.out.printf("%-25s : %.2f %s%n","Keliling Segitigas ", keliling, " cm" );
                break;
                
            default:
                System.out.println("Pilihan Yang Anda Pilih Tidak Tersedia");
        }
    }
}