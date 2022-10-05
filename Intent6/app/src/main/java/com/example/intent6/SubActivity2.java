package com.example.intent6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {
    Intent inSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        TextView sub2View = findViewById(R.id.sub2View);

        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioButton radioButton10 = findViewById(R.id.radioButton10);
        RadioButton radioButton20 = findViewById(R.id.radioButton20);
        RadioButton radioButton30 = findViewById(R.id.radioButton30);
        RadioButton radioButton40 = findViewById(R.id.radioButton40);

        inSub = getIntent();
        Bundle data = inSub.getExtras();
        if (data != null) {
            sub2View.setText(data.getString("name") + "さんは" + data.getString("gender") + "ですね" + "\n" + "年代は");
        }

        Button buttonPrevious2 = findViewById(R.id.buttonPrevious2);
        buttonPrevious2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String age = "";

                switch (radioGroup2.getCheckedRadioButtonId()) {
                    case R.id.radioButton10:
                        age = radioButton10.getText().toString();
                        break;

                    case R.id.radioButton20:
                        age = radioButton20.getText().toString();
                        break;

                    case R.id.radioButton30:
                        age = radioButton30.getText().toString();
                        break;

                    case R.id.radioButton40:
                        age = radioButton40.getText().toString();
                        break;

                }
                inSub.putExtra("age", age);
                setResult(Activity.RESULT_OK,inSub);
                finish();
            }
        });
    }
}