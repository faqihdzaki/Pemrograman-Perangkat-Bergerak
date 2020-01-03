package com.faqih.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputText extends AppCompatActivity {
    Button btnSend;
    EditText edtData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_text);
        btnSend = findViewById(R.id.btn_send);
        edtData = findViewById(R.id.edtCari);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isi = edtData.getText().toString();
                startActivity(new Intent(InputText.this,TampilActivity.class).putExtra("hasil", isi));
            }
        });
    }


}
