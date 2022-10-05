package com.example.fukusyu0401;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void onClickHello(View view) {
        textView.setText("ボタンが押されました");
        Log.d("MainActivity", "ボタンが押されました。");
        Toast.makeText(this, "ボタンが押されました。", Toast.LENGTH_SHORT).show();
    }
}