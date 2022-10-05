package com.example.intent5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMessage;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = findViewById(R.id.txtRecvData);
    }

    public void onClick(View v) {
        Intent in = new Intent(this, SubActivity.class);

        startActivityForResult(in, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            if (resultCode == Activity.RESULT_OK) {
                Bundle recv = data.getExtras();

                msg = recv.getString("MESSAGE");
            }
        }
        txtMessage.setText(msg);
    }
}