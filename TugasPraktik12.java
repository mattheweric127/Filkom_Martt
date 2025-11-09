import java.util.Scanner;

public class TugasPraktik12 {

    public static boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        if (cekPrima(bil)) {
            System.out.println(bil + " adalah bilangan prima");
        } else {
            System.out.println(bil + " bukan bilangan prima");
        }

        if (bil <= 100) {
            System.out.println("\nBilangan prima dari 1 sampai 100:");
            for (int i = 1; i <= 100; i++) {
                if (cekPrima(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("\nDaftar bilangan prima 1-100 tidak tersedia karena input lebih dari 100.");
        }
    }
}
