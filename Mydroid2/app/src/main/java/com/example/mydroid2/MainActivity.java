package com.example.mydroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dispBtn = findViewById(R.id.button);
        dispBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        TextView msgText=findViewById(R.id.textView);
        msgText.setText("ようこそAndroidの世界へ");
    }

}
