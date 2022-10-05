package com.example.intent6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView subView2;
    Intent inMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView subView = findViewById(R.id.subView);
        subView2 = findViewById(R.id.subView2);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButtonMan = findViewById(R.id.radioButtonMan);

        Button buttonNext2 = findViewById(R.id.buttonNext2);
        Button buttonPrevious = findViewById(R.id.buttonPrevious);

        inMain = getIntent();
        Bundle data = inMain.getExtras();
        if (data != null) {
            subView.setText(data.getString("name") + "さんの性別を選択してください");
        }

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inMain.putExtra("gender", radioButtonMan.isChecked() == true ? "男性" : "女性");
                setResult(Activity.RESULT_OK, inMain);
                finish();
            }
        });

        buttonNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSub = new Intent(getApplicationContext(), SubActivity2.class);
                intentSub.putExtras(inMain);
                intentSub.putExtra("gender", radioButtonMan.isChecked() == true ? "男性" : "女性");
                startActivityForResult(intentSub, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String msgName = "", msgGender = "", msgAge = "";
        if (resultCode == MainActivity.RESULT_OK) {
            if (requestCode == 0) {
                Bundle receive = data.getExtras();
                msgName = receive.getString("name");
                msgGender = receive.getString("gender");
                msgAge = receive.getString("age");
                inMain.putExtras(data);
            }

            if (msgAge != null) {
                subView2.setText(msgName + "さんの性別は" + msgGender + "で年代は" + msgAge + "です。");
            }
        }

    }
}