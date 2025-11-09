package oop3;

public class OopMobil{

    public static void main(String[] args) {
        Mobil mbl1 = new Mobil();
        Mobil mbl2 = new Mobil ("Kuning");
        Mobil mbl3 = new Mobil(120);

        mbl1.color = "Merah";
        mbl1.speed = 100;

    //    mbl2.color = "Biru";
    //    mbl2.speed = 50;

        mbl1.jmlmobil=2;
        mbl1.drive();
        mbl1.jmlmobil=5;
        mbl2.drive();
        mbl3.drive();
    }
}