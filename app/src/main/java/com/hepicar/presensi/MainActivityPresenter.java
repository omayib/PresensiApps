package com.hepicar.presensi;

import java.util.ArrayList;
import java.util.Date;

public class MainActivityPresenter {
    private View view;

    public MainActivityPresenter(View view) {
        this.view = view;
    }

    public void loadDaftarPresensi(){
        Mahasiswa hanif = new Mahasiswa("15.11.9088","Hanif");
        Presensi ansi = new Presensi("ANSI","5.2.4","arul",new Date());
        hanif.presence(ansi);
        ArrayList<Presensi> daftarPresensi = hanif.getDaftarPresensi();
        this.view.onLoadDaftarPresensiSuceed(daftarPresensi);
    }

    public void presence(){
        Mahasiswa hanif = new Mahasiswa("15.11.9088","Hanif");
        Presensi ansi = new Presensi("ANSI","5.2.4","arul",new Date());
        hanif.presence(ansi);
        this.view.onPresenceSuceed();
    }

    interface View{
        void onLoadDaftarPresensiSuceed(ArrayList<Presensi> daftarPresensi);
        void onPresenceSuceed();
        void onPresenceFailed(String message);
    }
}
