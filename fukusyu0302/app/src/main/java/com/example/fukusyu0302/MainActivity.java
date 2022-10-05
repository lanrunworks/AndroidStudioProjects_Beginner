package com.example.fukusyu0302;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        textView.setText("ようこそAndroidの世界へ");
        int id = view.getId();
        Log.d("MainActivity","ボタンが押されました。"+"ID"+String.valueOf(id));
    }
}