package com.example.omikuji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int no = random.nextInt(4);
                Log.d("random",String.valueOf(no));
                if(no==0){
                    imageView.setImageResource(R.drawable.omikuji_daikichi);
                }else if(no==1){
                    imageView.setImageResource(R.drawable.omikuji_kichi);
                }else if (no==2){
                    imageView.setImageResource(R.drawable.omikuji_suekichi);
                }else{
                    imageView.setImageResource(R.drawable.omikuji_kyou);
                }
            }
        });
    }
}