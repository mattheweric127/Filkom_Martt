import java.util.Scanner;
public class Method1{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Bilangan 1 : ");
        int op1 = input.nextInt();
        System.out.println("Masukkan Bilangan 2 : ");
        int op2 = input.nextInt();
        cetakKwitansi();
        //Method2.luasSegitiga(op1,op2);
        int hasil=0;
        hasil = jumlah2(op1,op2) + 100 * maksimum(op1,op2);
        System.out.println("Hasil : " + hasil);
    }

    public static void cetakKwitansi() {
        System.out.println("No. Kwitansi : 1");
        System.out.println("Nama Barang : Sepatu");
        System.out.println("Harga Barang : 100.000");
    }

    public static int jumlah2(int a,int b){
        return (a+b);
    }

    public static void jumlah(int a,int b){
        System.out.println(jumlah2(a,b));
    }

    public static int maksimum (int op1, int op2){
        System.out.println("Bandingkan " + op1 + " dan " + op2);
        if (op1>op2){
            return op1;
        } else {
            return op2;
        }
    }
}