public class tesdoang {
    static int jumlah(int[] data) {
        int total = 0;
        for (int i=0;i<data.length;i++){
            total += data[i];
        }
        return total;        
    }
    
    public static void main(String[] args) {
        int [] sum = {12,7};
        int jumlah = jumlah(sum);
        System.out.println("Hasil = "+jumlah);
    }
}
