package com.example.savedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputData = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileOutputStream fos = null;
                BufferedWriter bw = null;
                try {
                    fos = openFileOutput("sampleData.txt", MODE_APPEND);
                    bw = new BufferedWriter(new OutputStreamWriter(fos));
                    bw.write(inputData.getText().toString());
                    bw.newLine();
                    bw.flush();
                    bw.close();
                    Toast.makeText(getApplicationContext(), "データーを保存しました", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Toast.makeText(getApplicationContext(), "データー保存に失敗しました", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });

        TextView textView = findViewById(R.id.textView);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileInputStream fis = null;
                BufferedReader br = null;
                try {
                    fis = openFileInput("sampleData.txt");
                    br = new BufferedReader(new InputStreamReader(fis));
                    String data = "";
                    String line = "";
                    while ((line = br.readLine()) != null) {
                        data = data + line + "\n";
                    }
                    br.close();
                    textView.setText(data);
                    Toast.makeText(MainActivity.this, "データを読み込みました", Toast.LENGTH_SHORT).show();

                } catch (IOException e) {
                    Toast.makeText(MainActivity.this, "データーの読み込みに失敗しました", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
    }
}