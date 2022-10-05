package com.example.intent3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SubActivity3 extends AppCompatActivity {
    String nameluck = "";
    String stars = "";
    String lead = "";
    String defaultText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        TextView textViewStars = findViewById(R.id.textViewStars);
        Intent in = getIntent();
        Bundle data = in.getExtras();
        Random random = new Random();
        int num = random.nextInt(12) + 1;
        if (data != null) {
            nameluck = data.getString("name");
            stars = data.getString("stars");
            lead = String.valueOf(num);
            defaultText = nameluck + "さんの星座は" + stars + "で順位は" + lead + "位です";
            textViewStars.setText(defaultText);
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