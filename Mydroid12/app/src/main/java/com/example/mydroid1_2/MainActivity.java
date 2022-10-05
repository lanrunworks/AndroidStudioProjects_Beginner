package com.example.mydroid1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void btn1(View v1) {
//        Toast.makeText(getApplicationContext(),"ボタン1が押されました",Toast.LENGTH_SHORT).show();
//    }
//    public void btn2(View v2) {
//        Toast.makeText(getApplicationContext(),"ボタン2が押されました",Toast.LENGTH_SHORT).show();
//    }
    public void btn1(View v){
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(),"ボタン1が押されました",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(),"ボタン2が押されました",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}