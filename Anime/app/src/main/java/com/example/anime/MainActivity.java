package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onTouchEvent(MotionEvent event){
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            ImageView imageView = findViewById(R.id.imageView);
//        imageView.animate().rotation(360f).setDuration(1000);
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.myrotate1);

            imageView.startAnimation(animation);
        }
        return true;
    }
}