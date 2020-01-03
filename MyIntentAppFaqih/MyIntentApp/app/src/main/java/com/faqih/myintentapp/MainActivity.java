package com.faqih.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnBrowser;
    Button btnInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnBrowser = findViewById(R.id.btnBrowser);
        btnBrowser.setOnClickListener(this);

        btnInput = findViewById(R.id.btnInput);
        btnInput.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent( MainActivity.this, NewActivity.class );
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent moveData = new Intent( MainActivity.this, MoveActivityWithData.class );
                moveData.putExtra(MoveActivityWithData.EXTRA_NAME, "Luqman");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "085829390122";
                Intent dialPhone = new Intent (Intent.ACTION_DIAL, Uri.parse("tel: "+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btnBrowser:
                Uri uriUrl= Uri.parse("http://polines.ac.id");
                Intent link = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(link);
                break;
            case R.id.btnInput:
                Intent moveText = new Intent( MainActivity.this, InputText.class );
                startActivity(moveText);
                break;
        }
    }
}
