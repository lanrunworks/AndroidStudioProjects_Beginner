package com.example.testradiobutton01_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton A =findViewById(R.id.radioButton);
        RadioButton B =findViewById(R.id.radioButton2);
        RadioButton AB =findViewById(R.id.radioButton3);
        RadioButton O =findViewById(R.id.radioButton4);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(A.getId() == i){
                    Toast.makeText(MainActivity.this, A.getText(), Toast.LENGTH_SHORT).show();
                }else if (B.getId()==i){
                    Toast.makeText(MainActivity.this, B.getText(), Toast.LENGTH_SHORT).show();
                }else if (AB.getId()==i){
                    Toast.makeText(MainActivity.this, AB.getText(), Toast.LENGTH_SHORT).show();
                }else if (O.getId()==i){
                    Toast.makeText(MainActivity.this, O.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}