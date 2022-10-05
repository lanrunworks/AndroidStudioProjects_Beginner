package com.example.touchdirection;

import androidx.appcompat.app.AppCompatActivity;

import android.media.metrics.Event;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    float x_down = 0;
    float x_up = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            x_down = event.getX();
        }
        if (event.getAction() == MotionEvent.ACTION_UP) {
            x_up = event.getX();

            if (x_down < x_up) {
                Toast.makeText(this, "左→右", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "左←右", Toast.LENGTH_SHORT).show();
            }
        }
        return super.onTouchEvent(event);

    }
}