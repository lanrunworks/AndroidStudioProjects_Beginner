package com.example.preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Number;

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prefer = getSharedPreferences("data", MODE_PRIVATE);
        Number = prefer.getInt("number", 0);
        Number++;
        TextView textView = findViewById(R.id.textViewCnt);
        textView.setText(String.valueOf(Number));
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefer = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefer.edit();
        editor.putInt("number", Number);
        editor.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}