package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SubActivity extends AppCompatActivity {
    String nameluck = "";
    String luck = "";
    String defaultText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView textViewName = findViewById(R.id.textViewName);
        Intent in = getIntent();
        Bundle data = in.getExtras();
        Random random = new Random();
        int num = random.nextInt(5);

        if (data != null) {

            switch (num) {
                case 0:
                    luck = "大吉";
                    break;

                case 1:
                    luck = "末吉";
                    break;

                case 2:
                    luck = "吉";
                    break;

                case 3:
                    luck = "凶";
                    break;

                case 4:
                    luck = "大凶";
                    break;
            }
            nameluck = data.getString("name");
            defaultText = "さんの運勢は" + luck + "です";
            textViewName.setText(nameluck + defaultText);
        }

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}