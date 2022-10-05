package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        Button buttonName = findViewById(R.id.buttonName);
        Button buttonBlood = findViewById(R.id.buttonBlood);
        Button buttonStars = findViewById(R.id.buttonStar);

        Spinner spinner = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);


        buttonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), SubActivity.class);
                in.putExtra("name", editText.getText().toString());
                startActivity(in);
            }
        });

        buttonBlood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), SubActivity2.class);
                in.putExtra("name", editText.getText().toString());
                in.putExtra("blood", spinner.getSelectedItem().toString());
                startActivity(in);
            }
        });

        buttonStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), SubActivity3.class);
                in.putExtra("name", editText.getText().toString());
                in.putExtra("stars", spinner2.getSelectedItem().toString());
                startActivity(in);
            }
        });
    }
}