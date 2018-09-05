package com.hepicar.presensi;

import java.util.Date;

public class Presensi {
    private String matakuliah, tempat, dosen;
    private Date waktu;

    public Presensi(String matakuliah, String tempat, String dosen, Date waktu) {
        this.matakuliah = matakuliah;
        this.tempat = tempat;
        this.dosen = dosen;
        this.waktu = waktu;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public String getTempat() {
        return tempat;
    }

    public String getDosen() {
        return dosen;
    }

    public Date getWaktu() {
        return waktu;
    }
}
