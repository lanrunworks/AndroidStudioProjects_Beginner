package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    Button button3;
    Button button4;
    ImageView imageView;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i == 1) {
                    imageView.animate().alpha(0.75f).setDuration(1000);
                } else if (i == 2) {
                    imageView.animate().alpha(0.5f).setDuration(1000);

                } else if (i == 3) {
                    imageView.animate().alpha(0.25f).setDuration(1000);

                } else if (i == 4) {
                    imageView.animate().alpha(0f).setDuration(1000);
                } else {
                    imageView.animate().alpha(1f).setDuration(1000);
                    i = 0;
                }
            }
        });

        button2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i == 1) {
                    imageView.animate().scaleX(2f).scaleY(2f).setDuration(1000);
                } else if (i == 2) {
                    imageView.animate().scaleX(3f).scaleY(3f).setDuration(1000);
                } else if (i == 3) {
                    imageView.animate().scaleX(1f).scaleY(1f).setDuration(1000);
                } else if (i == 4) {
                    imageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
                } else {
                    imageView.animate().scaleX(0.25f).scaleY(0.25f).setDuration(1000);
                    i = 0;
                }
            }
        }));

        button3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i == 1) {
                    imageView.animate().rotation(360f).setDuration(1000);
                } else {
                    imageView.animate().rotation(-360f).setDuration(1000);
                    i = 0;
                }
            }
        }));

        button4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i == 1) {
                    imageView.animate().translationX(100f);
                } else if (i == 2) {
                    imageView.animate().translationY(200f);
                } else if (i == 3) {
                    imageView.animate().translationX(-100f);
                } else {
                    imageView.animate().translationY(-200f);
                    i = 0;
                }
            }
        }));
    }
}