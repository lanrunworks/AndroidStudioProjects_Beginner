package com.example.lightsensor_p252;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager manager;
    private TextView values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = (SensorManager) getSystemService(SENSOR_SERVICE);
        values = findViewById(R.id.textView);
    }

    @Override
    protected void onResume() {
        super.onResume();

        List<Sensor> sensors = manager.getSensorList(Sensor.TYPE_LIGHT);
        if (sensors.size() > 0) {
            Sensor s = sensors.get(0);
            manager.registerListener(this, s, SensorManager.SENSOR_DELAY_UI);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (manager != null) {
            manager.unregisterListener(this);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        String str = "";
        if (sensorEvent.sensor.getType() == Sensor.TYPE_LIGHT) {
            str = "照度" + sensorEvent.values[0];
            values.setText(str);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}