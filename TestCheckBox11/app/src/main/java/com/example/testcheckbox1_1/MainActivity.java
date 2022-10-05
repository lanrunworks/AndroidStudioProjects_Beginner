package com.example.testcheckbox1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox check1 = findViewById(R.id.checkBox1);
        CheckBox check2 = findViewById(R.id.checkBox2);
        CheckBox check3 = findViewById(R.id.checkBox3);
        CheckBox check4 = findViewById(R.id.checkBox4);
        CheckBox check5 = findViewById(R.id.checkBox5);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = new String();
                if(check1.isChecked()){
                    result += check1.getText();
                }
                if(check2.isChecked()){
                    result += "\t";
                    result += check2.getText();
                }
                if(check3.isChecked()){
                    result += "\t";
                    result += check3.getText();
                }
                if(check4.isChecked()){
                    result += "\t";
                    result += check4.getText();
                }
                if(check5.isChecked()){
                    result += "\t";
                    result += check5.getText();
                }
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }

        });
    }
}