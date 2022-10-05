package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //グローバル変数の定義
    //TextView型のジェネリクスの生成
    List<TextView> textViewList = new ArrayList<>();
    TextView textView = null;
    Button button=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);

        int[] lint_head = new int[]{7,4,1,0};
        for(int j = 0; j < 4; j++) {
            LinearLayout linearLayoutLine = new LinearLayout(this);
            linearLayoutLine.setOrientation(LinearLayout.HORIZONTAL);
            linearLayoutLine.setGravity(Gravity.CENTER);
            for(int i = 0; i < 3; i++){
                button = new Button(this);
                button.setText(String.valueOf(i +lint_head[j]));
                if(i==1 && j==3){button.setText(" ");}
                if(i==2 && j==3){button.setText(" ");}
                linearLayoutLine.addView(button);
            }
            linearLayout.addView(linearLayoutLine);
        }
    }
}

