package com.audiovideoplayer.mediaplayer.myapplicationlanguagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtPak,txtIsb,txtPUN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtPak=findViewById(R.id.txtPak);
        txtIsb=findViewById(R.id.txtIsb);
        txtPUN=findViewById(R.id.txtPUN);
    }
}