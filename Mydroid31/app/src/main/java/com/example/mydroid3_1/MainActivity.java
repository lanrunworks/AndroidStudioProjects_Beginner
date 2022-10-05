package com.example.mydroid3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new btnClick());
        btn2.setOnClickListener(new btnClick());
    }

    public class btnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
//            switch (view.getId()) {
//                case R.id.button:
//                    Toast.makeText(MainActivity.this, "btn1", Toast.LENGTH_SHORT).show();
//                    break;
//
//                case R.id.button2:
//                    Toast.makeText(MainActivity.this, "btn2", Toast.LENGTH_SHORT).show();
//                    break;
//            }
//
            if (view.getId() == R.id.button) {
                Toast.makeText(getApplicationContext(), "btn1", Toast.LENGTH_SHORT).show();
            } else if (view.getId() == R.id.button2) {
                Toast.makeText(MainActivity.this, "btn2", Toast.LENGTH_SHORT).show();
            }
        }
    }
}