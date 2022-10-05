package com.example.intent6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button buttonNext = findViewById(R.id.buttonNext);
        mainView = findViewById(R.id.mainView);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(getApplicationContext(), SubActivity.class);
                intentMain.putExtra("name", editText.getText().toString());
                startActivityForResult(intentMain, 0);
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
                mainView.setText(msgName + "さんの性別は" + msgGender + "で年代は" + msgAge + "です。");
            }
        }
    }
}