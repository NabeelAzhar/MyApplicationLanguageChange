package com.audiovideoplayer.mediaplayer.myapplicationlanguagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class FristActivity extends AppCompatActivity {
    TextView txtLah,txtRwp,txtKah;
    Button FristBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        txtLah=findViewById(R.id.txtLah);
        txtRwp=findViewById(R.id.txtRwp);
        txtKah=findViewById(R.id.txtKah);
        FristBtn=findViewById(R.id.FristBtn);
        FristBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FristActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}