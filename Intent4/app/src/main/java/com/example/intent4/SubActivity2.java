package com.example.intent4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {
    TextView tvResult;
    String str, str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        tvResult = findViewById(R.id.textView4);
        Intent in = getIntent();
        Bundle data = in.getExtras();

        if (data != null) {
            str = data.getString("name");
            str2 = data.getString("seibetsu");
            tvResult.setText(str + "さんは" + str2 + "ですね");
        }

        Button button = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}