package com.example.fukusyu0902;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint myPen = new Paint();
        myPen.setColor(Color.RED);
        myPen.setStrokeWidth(10);
        myPen.setStyle(Paint.Style.FILL);
        myPen.setAntiAlias(true);

        canvas.drawCircle(500, 500, 100, myPen);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
