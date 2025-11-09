public class Method4 {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 0;
       // Interger c = new Integer(9);
        //int d = new int (9);

        //Double f = new Double(0.5);
        double e = 0.5;

        int[] ar = new int[4];
        ar[0] = 7;
        ar[1] = 7;
        ar[2] = 7;
        ar[3] = 7;
        //System.out.println("bil primiritf 1 : "+a);
        //System.out.println("bil objek 1 : "+b);
        //System.out.println("array ke 1 : "+ar[1]);
        method1(a);
        method2(b);
        method3(ar);

        //System.out.println("bil primiritf 1 : "+a);
        //System.out.println("bil objek 1 : "+b);
        //System.out.println("array ke 1 : "+ar[1]);

        System.out.println("array ke 0 : "+ar[0]);
        System.out.println("array ke 1 : "+ar[1]);
        System.out.println("array ke 2 : "+ar[2]);
        System.out.println("array ke 3 : "+ar[3]);
    }

    public static void method1(int bil1){
        bil1=10;
    }

    public static void method2(Integer bil2){
        bil2=10;
    }

    public static void method3(int[] arrai){
        arrai[0] = 1;
        arrai[1] = 2;
        arrai[2] = 3;
        arrai[3] = 4;
    }
}