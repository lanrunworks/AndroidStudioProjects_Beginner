package com.example.linearacceleration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    SensorManager manager;
    TextView tvCnt;
    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        tvCnt = findViewById(R.id.textViewCnt);
        manager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (manager != null) {
            manager.unregisterListener(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Sensor> sensors = manager.getSensorList(Sensor.TYPE_LINEAR_ACCELERATION);
        if (sensors.size() > 0) {
            Sensor s = sensors.get(0);
            manager.registerListener(this, s, SensorManager.SENSOR_DELAY_UI);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_LINEAR_ACCELERATION) {
            if (sensorEvent.values[0] > 10.0 || sensorEvent.values[0] < -10.0) {
                cnt++;
                tvCnt.setText("" + cnt);
                if (cnt % 5 == 0) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.yahoo.co.jp"));
                    startActivity(intent);
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}