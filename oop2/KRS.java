package oop2;
import java.util.ArrayList;

public class KRS {
    public String semester;
    public Integer tahun;
    public Mahasiswa mhs;
    public ArrayList mks = new ArrayList();

    public void addMK(MataKuliah mk){
        mks.add(mk);
    }

    public void cetak(){
        for (int i= 0;i<mks.size();i++){
            System.out.println("KRS Semester"+semester+" Tahun "+tahun);
            System.out.println("NIM : "+mhs.nim);
            System.out.println("Nama : "+mhs.nama);
            System.out.println("==============================");
            MataKuliah _mk =(MataKuliah)mks.get(i);
            System.out.println(_mk.kode+" : "+_mk.nama);
        }
    }
    
}
