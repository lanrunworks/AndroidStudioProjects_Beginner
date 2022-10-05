package com.example.intent5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    TextView inMessage;
    Button btnBackMain;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        inMessage = findViewById(R.id.editText);
        in = getIntent();
    }

    public void onClick(View v) {
        in.putExtra("MESSAGE", inMessage.getText().toString());
        setResult(Activity.RESULT_OK,in);
        finish();
    }
}