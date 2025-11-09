import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input tiga baris huruf (misal: L O L, T X T, T O L)
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        String[] c = sc.nextLine().split(" ");

        // Huruf yang mungkin muncul
        int[] X = new int[10];
        int[] O = new int[10];
        int[] L = new int[10];
        int[] T = new int[10];

        // Coba semua kemungkinan angka 0-9 untuk X, O, L, T
        for (int x = 0; x <= 9; x++) {
            for (int o = 0; o <= 9; o++) {
                for (int l = 0; l <= 9; l++) {
                    for (int t = 0; t <= 9; t++) {
                        // Ganti huruf menjadi angka
                        int n1 = convert(a, x, o, l, t);
                        int n2 = convert(b, x, o, l, t);
                        int n3 = convert(c, x, o, l, t);

                        // Jika penjumlahan benar, tampilkan
                        if (n1 + n2 == n3) {
                            System.out.println("L=" + l + ", O=" + o + ", X=" + x + ", T=" + t);
                        }
                    }
                }
            }
        }
    }

    // Fungsi untuk mengubah huruf ke angka
    static int convert(String[] arr, int x, int o, int l, int t) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            switch (s) {
                case "X": sb.append(x); break;
                case "O": sb.append(o); break;
                case "L": sb.append(l); break;
                case "T": sb.append(t); break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
