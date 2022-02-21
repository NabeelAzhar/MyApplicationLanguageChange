package com.audiovideoplayer.mediaplayer.myapplicationlanguagechange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView txtPak,txtIsb,txtPUN;
    Button mainBtn;
    Spinner spinner;
    String spin="pakistan";
    String language="change Language";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPak=findViewById(R.id.txtPak);
        txtIsb=findViewById(R.id.txtIsb);
        txtPUN=findViewById(R.id.txtPUN);
        mainBtn=findViewById(R.id.mainBtn);
        spinner=findViewById(R.id.spinner);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,FristActivity.class);
                startActivity(intent);
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if (position==1){
                    spin="pakistan";
                    setLocale("ur");
                    Intent serviceIntent= new Intent(MainActivity.this,LanguageService.class);
                    serviceIntent.putExtra("urdu",language);
                    startService(serviceIntent);

                } else if (position==2){
                    spin="India";
                    setLocale("hi");
                } else if (position==3){
                    spin="Usa";
                    setLocale("en");
                }
                else if (position==4){
                    spin="saudia";
                    setLocale("ar");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void setLocale(String language) {
        Locale myLocale = new Locale(language);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        finish();
        startActivity(refresh)
        ;
    }
}