package com.justoye.customfontsandroid;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView helloworld;
    Button change_font;
    int[] fonts = new int[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloworld = findViewById(R.id.helloworld);
        change_font = findViewById(R.id.change_font);

        fonts[0] = R.font.font1;
        fonts[1] = R.font.font2;
        fonts[2] = R.font.font3;
        fonts[3] = R.font.font4;
        fonts[4] = R.font.font5;
        fonts[5] = R.font.font6;
        fonts[6] = R.font.font7;
        fonts[7] = R.font.font8;
        fonts[8] = R.font.font9;
        fonts[9] = R.font.font10;
        fonts[10] = R.font.font11;
        fonts[11] = R.font.font12;
        fonts[12] = R.font.font13;
        fonts[13] = R.font.kavi;
        fonts[14] = R.font.noto;

        change_font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changefont();
            }
        });

    }

    private void changefont() {



        int idfx = new Random().nextInt(fonts.length);
        int randomfnts = (fonts[idfx]);



        Typeface typeface = ResourcesCompat.getFont(getApplicationContext(), randomfnts);
        helloworld.setTypeface(typeface);
    }
}
