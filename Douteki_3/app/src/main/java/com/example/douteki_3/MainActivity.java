package com.example.douteki_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<TextView> textViewsList = new ArrayList<>();
    TextView textView = null;
    Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        for (int i = 0; i < 10; i++) {
//            textView = new TextView(this);
//            textView.setText("textView" + i);
            btn = new Button(this);
            btn.setText(""+i);
            linearLayout.addView(btn);
            textViewsList.add(btn);
        }
        textViewsList.get(5).setText("テキストの変更");
    }
}