package com.hepicar.presensi;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void initialize_mahasiswa(){
        Mahasiswa hanif = new Mahasiswa("15.11.9088","Hanif");
        assertEquals("Hanif",hanif.getNama());
    }

    @Test
    public void testing_nama_dosen_harus_benar(){
        Presensi ansi = new Presensi("ANSI","5.2.4","arul",new Date());
        assertEquals("arul",ansi.getDosen());
    }

    @Test
    public void presensi_harus_benar(){

        Mahasiswa hanif = new Mahasiswa("15.11.9088","Hanif");
        Presensi ansi = new Presensi("ANSI","5.2.4","arul",new Date());
        Presensi rpl = new Presensi("RPL","5.2.4","arul",new Date());

        hanif.presence(ansi);

        // hanif.getDaftarPresensi() -> [ansi,rpl,pwl]
        // hanif.getDaftarPresensi().contains(ansi) => true

        ArrayList<Presensi> presensiYangPernahDilakukan = hanif.getDaftarPresensi();
        assertTrue(presensiYangPernahDilakukan.contains(rpl));
    }
}