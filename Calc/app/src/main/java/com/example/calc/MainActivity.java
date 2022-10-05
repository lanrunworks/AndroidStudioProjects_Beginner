package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);

        Button button = findViewById(R.id.button);
        TextView textView7 = findViewById(R.id.textView7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editText.getText().toString());
                int b = Integer.parseInt(editText2.getText().toString());
                textView7.setText(String.valueOf(a+b));
            }
        });
    }
}