package com.example.camera_p340;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setAction("android.media.action.IMAGE_CAPTURE");
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((resultCode == RESULT_OK) && (requestCode == 1)) {
            Bitmap b = (Bitmap) data.getExtras().get("data");
            ImageView imageView = findViewById(R.id.imageView);
            imageView.setImageBitmap(b);

        }
    }
}