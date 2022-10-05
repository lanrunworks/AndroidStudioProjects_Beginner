package com.example.intent4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    TextView tvName;
    RadioButton rbSeibetsu;
    RadioGroup rg;
    String str;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tvName = findViewById(R.id.textView5);
        rbSeibetsu = findViewById(R.id.radioButton);
        rg = findViewById(R.id.radioGroup);

        in = getIntent();
        Bundle data = in.getExtras();
        if (data != null) {
            str = data.getString("name");
            tvName.setText(str + "さんの性別を選択してください");
        }
    }

    public void onClick_mae(View view) {
        finish();
    }

    public void onClick_tugi(View view) {
        Intent in1 = new Intent(this, SubActivity2.class);
        in1.putExtras(in);
        in1.putExtra("seibetsu", (rbSeibetsu.isChecked() == true ? "男性" : "女性"));
        startActivity(in1);
    }
}