package com.example.mydroid4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        btn1.setOnClickListener(new buttonClick());
        btn2.setOnClickListener(new buttonClick());
    }

    public class buttonClick implements View.OnClickListener {
        int count = 0;

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    EditText inMsg1 = findViewById(R.id.editText1);
                    text1.setText(inMsg1.getText());
                    EditText inMsg2 = findViewById(R.id.editText2);
                    text2.setText(inMsg2.getText());
                    Log.d("MainActivity", "used_in");
                    break;
                case R.id.button2:

                    count++;
                    if (count == 1) {
                        EditText chMsg1 = findViewById(R.id.editText1);
                        text2.setText(chMsg1.getText());
                        EditText chMsg2 = findViewById(R.id.editText2);
                        text1.setText(chMsg2.getText());
                    } else {
                        EditText chMsg1 = findViewById(R.id.editText1);
                        text1.setText(chMsg1.getText());
                        EditText chMsg2 = findViewById(R.id.editText2);
                        text2.setText(chMsg2.getText());
                        count = 0;
                    }

                    Log.d("MainActivity", "used_ch" + count);
                    break;
            }
        }
    }
}