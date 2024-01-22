package com.abhi.redirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item4 extends AppCompatActivity {

    Button item03, telegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item4);

        item03 = findViewById(R.id.Button03);
        telegram = findViewById(R.id.telegram);

        item03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://91clubin.in/#/register?invitationCode=155111282895"));
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