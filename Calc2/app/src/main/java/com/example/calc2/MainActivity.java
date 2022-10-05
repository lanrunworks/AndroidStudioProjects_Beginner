package com.example.calc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);


        TextView textView7 = findViewById(R.id.textView7);
//
//        RadioButton radioButton = findViewById(R.id.radioButton);
//        RadioButton radioButton2 = findViewById(R.id.radioButton2);
//        RadioButton radioButton3 = findViewById(R.id.radioButton3);
//        RadioButton radioButton4 = findViewById(R.id.radioButton4);

        RadioGroup radioGroup = findViewById(R.id.radioGroup4);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editText2.getText().toString());

                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radioButton:
                        textView7.setText(String.valueOf(a + b));
                        Log.d("+",a+""+b);
                        break;

                    case R.id.radioButton2:
                        textView7.setText(String.valueOf(a - b));
                        Log.d("-",a+""+b);
                        break;

                    case R.id.radioButton3:
                        textView7.setText(String.valueOf(a * b));
                        Log.d("*",a+""+b);
                        break;

                    case R.id.radioButton4:
                        double p = (double) a / (double) b;
                        textView7.setText(String.valueOf(p));
                        Log.d("/",a+""+b+""+p);
                        break;
                }
                Log.d("radio",String.valueOf(radioGroup.getCheckedRadioButtonId()));

            }
        });

    }
}