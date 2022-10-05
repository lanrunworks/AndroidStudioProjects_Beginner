package com.example.mydroid4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dispBtn = findViewById(R.id.button);
        dispBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText inMsg = findViewById(R.id.editText);
                Toast.makeText(getApplicationContext(),inMsg.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}