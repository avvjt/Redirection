package com.abhi.redirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item1 extends AppCompatActivity {
    Button item1, telegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);
        item1 = findViewById(R.id.Button01);
        telegram = findViewById(R.id.telegram);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://damanlottery.net/#/register?invitationCode=455244124893"));
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