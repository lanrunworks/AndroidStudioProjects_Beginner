package com.example.testradiobutton01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioButton = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Log.d("MainActivity", String.valueOf(i));
                if(radioButton.getId()==i){
                    Log.d("MainActivity", "酷暑が選択されました");
                }else{
                    Log.d("MainActivity", "猛暑が選択されました");
                }
            }

        });
    }
}