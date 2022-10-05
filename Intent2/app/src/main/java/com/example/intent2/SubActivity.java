package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    String msg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView textView2 = findViewById(R.id.textView2);
        Intent in = getIntent();
        Bundle data = in.getExtras();
        if (data != null) {
            msg = data.getString("message");
            textView2.setText(msg);
        }
//        textView2.setText(String.valueOf(in.getExtras().getString("message")));
    }
}