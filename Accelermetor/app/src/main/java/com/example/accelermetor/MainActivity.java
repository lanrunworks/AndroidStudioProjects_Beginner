package com.example.accelermetor;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sManager;
    private TextView values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        values = findViewById(R.id.textView);
        sManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sManager.unregisterListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Sensor> sensors = sManager.getSensorList(Sensor.TYPE_ORIENTATION);
        if (sensors.size() > 0) {
            Sensor s = sensors.get(0);
            sManager.registerListener(this, s, SensorManager.SENSOR_DELAY_UI);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        String str = "";
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ORIENTATION) {
            str = "方位角：" + sensorEvent.values[0] + "\n傾斜角" + sensorEvent.values[1] + "\n回転角：" + sensorEvent.values[2];
            values.setText(str);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}