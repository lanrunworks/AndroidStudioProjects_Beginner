package com.example.intent4;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editText);
    }

    public void onClick(View v) {
        Intent in = new Intent(this, SubActivity.class);
        in.putExtra("name", etName.getText().toString());
        startActivity(in);
    }
}