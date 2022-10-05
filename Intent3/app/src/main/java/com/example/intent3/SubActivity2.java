package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SubActivity2 extends AppCompatActivity {
    String nameluck = "";
    String blood = "";
    String point = "";
    String defaultText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        TextView textViewBlood = findViewById(R.id.textViewBlood);
        Intent in = getIntent();
        Bundle data = in.getExtras();
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        if (data != null) {
            nameluck = data.getString("name");
            blood = data.getString("blood");
            point = String.valueOf(num);
            defaultText = nameluck + "さんの血液型は" + blood + "です。\n今日の得点は" + point + "点です。";
            textViewBlood.setText(defaultText);
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