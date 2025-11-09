import java.util.Scanner;

public class StudiKasus4B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] z = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            z[i] = input.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (z[j] < z[j + 1]) {
                    int temp = z[j];
                    z[j] = z[j + 1];
                    z[j + 1] = temp;
                }
            }
        }

        System.out.println("\nArray setelah diurutkan (descending):");
        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
        input.close();
    }
}
