package com.example.greet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button button;
    Button button2;
    Button button3;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        res = getResources();

    }

    @Override
    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.button:
//                textView.setText(R.string.greetingmorning);
//                Log.d("main", String.valueOf(view.getId()));
//                break;
//
//            case R.id.button2:
//                textView.setText(R.string.greetingnoon);
//
//                Log.d("main2", String.valueOf(view.getId()));
//                break;
//
//            case R.id.button3:
//                textView.setText(R.string.greetingevening);
//                Log.d("main3", String.valueOf(view.getId()));
//                break;
//        }
        switch (view.getId()) {
            case R.id.button:
                textView.setText(res.getString(R.string.greetingmorning));
                Log.d("main", String.valueOf(view.getId()));
                break;

            case R.id.button2:
                textView.setText(res.getString(R.string.greetingnoon));

                Log.d("main2", String.valueOf(view.getId()));
                break;

            case R.id.button3:
                textView.setText(res.getString(R.string.greetingevening));
                Log.d("main3", String.valueOf(view.getId()));
                break;
        }
    }
}
