package com.faqih.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnDonation = findViewById(R.id.Donasi);
        BtnDonation.setOnClickListener(this);


        if(getSupportActionBar()!=null) {
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Donasi :
                Intent Donasi = new Intent(MainActivity.this, Donation.class);
                startActivity(Donasi);

        }

    }
}
