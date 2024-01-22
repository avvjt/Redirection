package com.abhi.redirection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.window.SplashScreen;

public class MainActivity extends AppCompatActivity {
    Boolean isReady = false;
    Button firstgame, secGame, thirdGame, fourthGame, fifthGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        androidx.core.splashscreen.SplashScreen.installSplashScreen(this);
        View content = findViewById(android.R.id.content);

        //SplashScreen
        content.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                if (isReady) {
                    content.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                dismissSplashScreen();
                return false;
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button1
        firstgame = findViewById(R.id.firstGame);
        //Button2
        secGame = findViewById(R.id.secGame);
        //Button3
        thirdGame = findViewById(R.id.thirdGame);
        //Button4
        fourthGame = findViewById(R.id.fourthGame);
        //Button5
        fifthGame = findViewById(R.id.fifthGame);

        firstgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Item1.class);
                startActivity(i);


            }
        });

        secGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Item2.class);
                startActivity(i);


            }
        });

        thirdGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Item3.class);
                startActivity(i);


            }
        });

        fourthGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Item4.class);
                startActivity(i);


            }
        });

        fifthGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Item5.class);
                startActivity(i);


            }
        });
    }

    private void dismissSplashScreen() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isReady=true;
            }
        }, 2000);
    }
}