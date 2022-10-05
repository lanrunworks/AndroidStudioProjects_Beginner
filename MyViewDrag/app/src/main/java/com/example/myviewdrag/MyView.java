package com.example.myviewdrag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    float x = -100;
    float y = -100;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        //ドラッグを検知
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
//            Log.d("main", "探知");
            x = event.getX();
            y = event.getY();
            invalidate();
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint pen = new Paint();
        pen.setColor(Color.GREEN);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x, y, 100, pen);
        pen.setAntiAlias(true);
    }


    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

}

