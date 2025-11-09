import java.util.Scanner;

public class StudiKasus4A {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Bilangan Pertama : ");
        int x = input.nextInt();
        System.out.println("Masukkan Bilangan Kedua");
        int y = input.nextInt();
        System.out.println("Operasi (jumlah, kurang, kali, bagi) : ");
        String operasi = input.next();

        switch (operasi) {
            case "jumlah":
                penjumlahan(x,y);
                break;
            case "kurang": 
                pengurangan(x,y);
                break;
            case "kali":
                perkalian(x,y);
                break;
            case "bagi":
                pembagian(x,y);
                break;
            default:
                System.out.println("Error: Operasi tidak dikenali.");
        } 
    }

    public static void penjumlahan(int x, int y){
        int hasil = x + y;
        System.out.println("Hasil Penjumlahan : "+hasil);
    }

    public static void pengurangan(int x, int y){
        int hasil = x - y;
        System.out.println("Hasil Pengurangan : "+hasil);
    }

    public static void perkalian(int x, int y){
        int hasil = x * y;
        System.out.println("Hasil Perkalian : "+hasil);
    }

    public static void pembagian(int x, int y){
        if (y != 0) {
            int hasil = x / y;
            System.out.println("Hasil Pembagian : "+hasil);
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}