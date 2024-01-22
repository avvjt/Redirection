package com.abhi.redirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item5 extends AppCompatActivity {

    Button item04, telegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item5);

        item04 = findViewById(R.id.Button04);
        telegram = findViewById(R.id.telegram);

        item04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://bigmumbai.link/#/register?invitationCode=34338274715"));
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