package com.abhi.redirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Item3 extends AppCompatActivity {

    Button item02, telegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item3);

        item02 = findViewById(R.id.Button02);
        telegram = findViewById(R.id.telegram);

        item02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://fastwin.one/LR?RG&C=47205649128"));
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