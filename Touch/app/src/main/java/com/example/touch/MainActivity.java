package com.example.touch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            Log.d("a", String.valueOf(event));
            float X = event.getX();
            float Y = event.getY();
            textView4.setText(String.valueOf(X));
            textView3.setText(String.valueOf(Y));
        }
        return super.onTouchEvent(event);
    }
}