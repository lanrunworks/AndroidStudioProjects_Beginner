package com.example.doutekihaiti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView[] textViews = new TextView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViews[0] = findViewById(R.id.textView1);
        textViews[1] = findViewById(R.id.textView2);
        textViews[2] = findViewById(R.id.textView3);

    }

    public void onBtnClick(View view) {
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int a = random.nextInt(3);
            textViews[i].setText("data" + i + "\n random" + a);
        }
    }
}