package com.hepicar.presensi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {
    private static final String TAG = "MainActivity";
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        Button buttonAmbilData = new Button(this);
        buttonAmbilData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadDaftarPresensi();
            }
        });

        Button buttonPresensi = new Button(this);
        buttonPresensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.presence();
            }
        });
    }

    @Override
    public void onLoadDaftarPresensiSuceed(ArrayList<Presensi> daftarPresensi) {
        Log.d(TAG, "onLoadDaftarPresensiSuceed() called with: daftarPresensi = [" + daftarPresensi + "]");
    }

    @Override
    public void onPresenceSuceed() {
        Log.d(TAG, "onPresenceSuceed() called");
    }

    @Override
    public void onPresenceFailed(String message) {
        Log.d(TAG, "onPresenceFailed() called with: message = [" + message + "]");
    }
}
