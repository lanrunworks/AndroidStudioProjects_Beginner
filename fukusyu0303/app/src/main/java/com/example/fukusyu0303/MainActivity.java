package com.example.fukusyu0303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }
    public void onClick1(View view){
        textView.setText("暑い");
    }
    public void onClick2(View view){
        textView.setText("快適");
    }
    public void onClick3(View view){
        textView.setText("寒い");
    }

//    @Override //+implements View.OnClickListener の場合
//    public void onClick(View view) {
////        if (view == button1){
////            textView.setText("暑い");
////            int id = view.getId();
////            Log.d("MainActivity","ボタン1が押されました。"+"ID"+String.valueOf(id));
////        }else if(view == button2){
////            textView.setText("快適");
////            int id = view.getId();
////            Log.d("MainActivity","ボタン2が押されました。"+"ID"+String.valueOf(id));
////        }else if(view == button3){
////            textView.setText("寒い");
////            int id = view.getId();
////            Log.d("MainActivity","ボタン3が押されました。"+"ID"+String.valueOf(id));
////        }
//
////        switch(view.getId()){
////            case R.id.button1:
////                textView.setText("暑い");
////                int id = view.getId();
////                Log.d("MainActivity","ボタン1が押されました。"+"ID"+String.valueOf(id));
////                break;
////
////            case R.id.button2:
////                textView.setText("快適");
////                int id2 = view.getId();
////                Log.d("MainActivity","ボタン2が押されました。"+"ID"+String.valueOf(id2));
////                break;
////
////            case R.id.button3:
////                textView.setText("寒い");
////                int id3 = view.getId();
////                Log.d("MainActivity","ボタン3が押されました。"+"ID"+String.valueOf(id3));
////                break;
////        }
//
//    }
}