import java.util.Scanner;

public class TugasPraktik7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi huruf M: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("M ");
                }

                else if (j == i && j <= n / 2) {
                    System.out.print("M ");
                }

                else if (i + j == n - 1 && j >= n / 2) {
                    System.out.print("M ");
                }
                else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}

