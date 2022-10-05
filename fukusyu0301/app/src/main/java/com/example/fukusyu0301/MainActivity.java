package com.example.fukusyu0301;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Log.d("MainActivity","ボタンが押されました。");
        //Toast.makeText(getApplicationContext(),"ようこそAndroidの世界へ",Toast.LENGTH_SHORT).show();
        Toast t = Toast.makeText(getApplicationContext(),"ようこそAndroidの世界へ",Toast.LENGTH_SHORT);
        t.show();

    }
}