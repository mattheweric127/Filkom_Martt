import java.util.Scanner;

public class Remed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = sc.nextInt();
        int kolom = sc.nextInt();

        if (baris <= 0 || kolom <= 0) {
            System.out.println("Input tidak sesuai");
            return;
        }

        char[][] peta = new char[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                peta[i][j] = '.';
            }
        }

        int jumlah = sc.nextInt();
        int kx = -1, ky = -1;

        for (int i = 0; i < jumlah; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            char simbol = sc.next().toUpperCase().charAt(0);

            if (r < 0 || r >= baris || c < 0 || c >= kolom) {
                System.out.println("Input tidak sesuai");
                return;
            }

            peta[r][c] = simbol;
            if (simbol == 'K') {
                kx = r;
                ky = c;
            }
        }

        if (kx != -1 && ky != -1) {

            for (int i = kx - 1; i >= 0; i--) {
                if (peta[i][ky] == '.') peta[i][ky] = '*';
                else break;
            }

            for (int i = kx + 1; i < baris; i++) {
                if (peta[i][ky] == '.') peta[i][ky] = '*';
                else break;
            }

            for (int j = ky - 1; j >= 0; j--) {
                if (peta[kx][j] == '.') peta[kx][j] = '*';
                else break;
            }

            for (int j = ky + 1; j < kolom; j++) {
                if (peta[kx][j] == '.') peta[kx][j] = '*';
                else break;
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(peta[i][j]);
                if (j < kolom - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
