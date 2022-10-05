package com.example.fukusyu0901;

import androidx.appcompat.app.AppCompatActivity;

import android.media.metrics.Event;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            ImageView imageView = findViewById(R.id.imageView);
            ImageView imageView2 = findViewById(R.id.imageView2);

            imageView.setImageResource(R.drawable.flower_tulip);
            imageView2.setImageResource(R.drawable.flower_higanbana);

        }
        return super.onTouchEvent(event);
    }

}