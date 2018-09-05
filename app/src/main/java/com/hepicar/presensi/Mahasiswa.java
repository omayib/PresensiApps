package com.hepicar.presensi;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim, nama;
    private ArrayList<Presensi> daftarPresensi= new ArrayList<>();

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Presensi> getDaftarPresensi() {
        return daftarPresensi;
    }

    public void presence(Presensi presensi){
        this.daftarPresensi.add(presensi);
    }
}
