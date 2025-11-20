package Peminjaman;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<Buku> daftarPinjaman;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.daftarPinjaman = new ArrayList<>();
    }

    public void pinjam(Buku buku) {
        daftarPinjaman.add(buku);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Buku> getDaftarPinjaman() {
        return daftarPinjaman;
    }
}

