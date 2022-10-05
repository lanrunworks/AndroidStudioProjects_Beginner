package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        TextView textView8 = findViewById(R.id.textView8);
        TextView textView9 = findViewById(R.id.textView9);
        TextView textView10 = findViewById(R.id.textView10);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().toString().equals("") || editText2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "数字を入れてください", Toast.LENGTH_SHORT).show();
                }else{
                    double weight = Integer.parseInt(String.valueOf(editText2.getText()));
                    double height = Double.parseDouble(String.valueOf(editText.getText()));
                    double standard = (height / 100) * (height / 100) * 22;
                    double BMIresult = weight / ((height / 100) * (height / 100));
                    textView8.setText(String.format("%6.1fkg", weight));
                    textView9.setText(String.format("%6.1fkg", standard));
                    textView10.setText(String.format("%6.1fkg", BMIresult));

                    if (BMIresult < 18.5) {
                        Toast.makeText(MainActivity.this, "低体重", Toast.LENGTH_SHORT).show();
                    } else if (BMIresult >= 18.5 && BMIresult < 25) {
                        Toast.makeText(MainActivity.this, "標準体重", Toast.LENGTH_SHORT).show();
                    } else if (BMIresult >= 25 && BMIresult < 30) {
                        Toast.makeText(MainActivity.this, "肥満1度", Toast.LENGTH_SHORT).show();
                    } else if (BMIresult >= 30 && BMIresult < 35) {
                        Toast.makeText(MainActivity.this, "肥満2度", Toast.LENGTH_SHORT).show();
                    } else if (BMIresult >= 35 && BMIresult < 40) {
                        Toast.makeText(MainActivity.this, "肥満3度", Toast.LENGTH_SHORT).show();
                    } else if (BMIresult >= 40) {
                        Toast.makeText(MainActivity.this, "肥満4度", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}