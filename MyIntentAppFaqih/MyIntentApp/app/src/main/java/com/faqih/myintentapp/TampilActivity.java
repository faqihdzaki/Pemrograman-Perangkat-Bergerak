package com.faqih.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TampilActivity extends AppCompatActivity {
    TextView TVtampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        TVtampil = findViewById(R.id.TVtampil);

        String hasil = getIntent().getStringExtra("hasil");
        TVtampil.setText(hasil);
    }
}
