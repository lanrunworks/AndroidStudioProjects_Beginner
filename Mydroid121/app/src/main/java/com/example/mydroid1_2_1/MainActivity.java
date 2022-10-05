package com.example.mydroid1_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    Button btn2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        text = findViewById(R.id.textView);
    }

    public void onClick(View view) {
        if (view == btn){
            Toast.makeText(this, "Text1", Toast.LENGTH_SHORT).show();
            text.setText("ボタン1だね");
        }else if(view == btn2){
            Toast.makeText(this, "Text2", Toast.LENGTH_SHORT).show();
            text.setText("ボタン2だね");
        }
    }
}