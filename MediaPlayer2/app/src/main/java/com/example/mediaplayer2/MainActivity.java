package com.example.mediaplayer2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;
    Spinner spinner;
    Button button;
    Button button2;
    Button button3;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(getApplicationContext(), R.raw.music1);

        textView3 = findViewById(R.id.textView3);

        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 1:
                        song = MediaPlayer.create(getApplicationContext(), R.raw.music1);
                        break;

                    case 2:
                        song = MediaPlayer.create(getApplicationContext(), R.raw.music2);
                        break;

                    case 3:
                        song = MediaPlayer.create(getApplicationContext(), R.raw.music3);
                        break;

                    case 4:
                        song = MediaPlayer.create(getApplicationContext(), R.raw.music4);
                        break;

                    case 5:
                        song = MediaPlayer.create(getApplicationContext(), R.raw.music5);
                        break;

                    case 6:
                        song = MediaPlayer.create(getApplicationContext(), R.raw.intro);
                        break;
                }
                textView3.setText(String.valueOf(song.getDuration()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.start();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.pause();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song.stop();
            }
        });
    }
    protected void onDestroy(){
        super.onDestroy();
        song.release();
    }
}