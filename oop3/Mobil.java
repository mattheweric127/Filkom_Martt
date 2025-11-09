package oop3;

public class Mobil {
    
    public String color;
    public int speed;
    public int power;
    public static int jmlmobil;
    //public mobil() {} default constructer

    public Mobil(){
        System.out.println("Instansiasi 1 Mobil");
        color = "SILVER";
        speed= 40;
        jmlmobil++;
    }

    public Mobil(String color){
        System.out.println("Instansiasi 2 Mobil");
        this.color = color;
        speed= 40;
        jmlmobil++;
    }

    public Mobil(int kecepatan){
        System.out.println("Instansiasi 3 Mobil");
        color = "SILVER";
        speed= kecepatan;
    }
    
    public void drive(){
        System.out.println("mobil ke "+ jmlmobil + " berjalan dengan kecepatan " + speed);
    }
    
    public void drive(String warna){
        System.out.println("mobil warna "+ color + " drive kecepatan " + speed);
    }
    public void turnRight(){ 
        System.out.println("turnRight");
    }
    public void turnLeft(){ 
        System.out.println("turnLeft");
    }
    public void stop(){ 
        System.out.println("stop");
    }

}
