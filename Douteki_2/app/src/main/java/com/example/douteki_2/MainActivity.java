package com.example.douteki_2;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
        TextView textView = new TextView(this);
        textView.setText("test");
        textView.setBackgroundColor(Color.CYAN);
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
    }
}