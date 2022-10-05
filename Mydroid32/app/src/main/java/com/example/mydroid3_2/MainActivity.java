package com.example.mydroid3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new Fuction());

        text = findViewById(R.id.textView);
    }

    public class Fuction implements View.OnClickListener {
        int count = 0;

        public void onClick(View view) {
            count++;
            if (count % 2 == 1) {
                text.setText("a");
            } else {
                text.setText("b");
                count = 0;
            }
            Log.d("MainActivity", String.valueOf(count));
        }
    }
}