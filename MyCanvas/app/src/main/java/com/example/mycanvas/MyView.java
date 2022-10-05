package com.example.mycanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pen = new Paint();
        pen.setColor(Color.RED);
        pen.setStyle(Paint.Style.FILL);
        pen.setAntiAlias(true);

        canvas.drawText("画面の上をドラックしてください", 50, 50, pen);

        canvas.drawLine(100, 200, 1000, 200, pen);
        canvas.drawLine(100, 300, 1000, 300, pen);

        canvas.drawCircle(250, 700, 200, pen);

        RectF ovalRect = new RectF(500, 500, 800, 1200);
        canvas.drawOval(ovalRect, pen);

        pen.setColor(Color.BLUE);
        pen.setStyle(Paint.Style.STROKE);

        canvas.drawRect(100, 1300, 1000, 1500, pen);

        Path myPath = new Path();
        myPath.moveTo(100, 1600);
        myPath.lineTo(500, 1700);
        myPath.lineTo(100, 1800);
        myPath.lineTo(1000, 1800);
        canvas.drawPath(myPath, pen);
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

