package com.abhi.redirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item2 extends AppCompatActivity {

    Button item01, telegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);

        item01 = findViewById(R.id.Button01);
        telegram = findViewById(R.id.telegram);

        item01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.9987up.club/#/register?r_code=YYa172571744"));
                startActivity(viewIntent);
            }
        });
        telegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://t.me/All_colour_prediction_hack"));
                startActivity(viewIntent);
            }
        });
    }
}