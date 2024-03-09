package com.example.seventhlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView screen, coordinates;
    private int[] mass = new int[10];
    private int rate = 50;

    private void getRandomInt(int xBound, int yBound) {
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                mass[i] = random.nextInt(xBound);
            } else {
                mass[i] = random.nextInt(yBound);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        coordinates = findViewById(R.id.coordinates);

        getRandomInt(750, 1200);

        screen.setOnTouchListener((v, event) -> {
            Log.i("MainActivityCheck", "x: " + event.getX() + "y" + event.getY());

            if (event.getX() <= mass[0] + 50 && event.getX() >= mass[0] - 50
                    && event.getY() <= mass[1] + 50 && event.getY() >= mass[1] - 50)
                Toast.makeText(MainActivity.this, "Вам повезло!!Вы нашли ключ", Toast.LENGTH_LONG).show();
            else if (event.getX() <= mass[2] + 50 && event.getX() >= mass[2] - 50
                    && event.getY() <= mass[3] + 50 && event.getY() >= mass[3] - 50) {
                Toast.makeText(MainActivity.this, "Вам повезло!!!Вы нашли ключ", Toast.LENGTH_LONG).show();
            }else if (event.getX() <= mass[4] + 50 && event.getX() >= mass[4] - 50
                    && event.getY() <= mass[5] + 50 && event.getY() >= mass[5] - 50) {
                Toast.makeText(MainActivity.this, "Вам повезло!!!Вы нашли ключ", Toast.LENGTH_LONG).show();
            }else if (event.getX() <= mass[6] + 50 && event.getX() >= mass[6] - 50
                    && event.getY() <= mass[7] + 50 && event.getY() >= mass[7] - 50) {
                Toast.makeText(MainActivity.this, "Вам повезло!!!Вы нашли ключ", Toast.LENGTH_LONG).show();
            }else if (event.getX() <= mass[8] + 50 && event.getX() >= mass[8] - 50
                    && event.getY() <= mass[9] + 50 && event.getY() >= mass[9] - 50) {
                Toast.makeText(MainActivity.this, "Вам повезло!!!Вы нашли ключ", Toast.LENGTH_LONG).show();
            }


                return true;
            });
        }

    }

