package com.example.mydroid3;

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

        Button disBtn = findViewById(R.id.button);
        disBtn.setOnClickListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            TextView outMsg = findViewById(R.id.textView);
            EditText inMsg = findViewById(R.id.editText);
            outMsg.setText(inMsg.getText());
        }
    }
}