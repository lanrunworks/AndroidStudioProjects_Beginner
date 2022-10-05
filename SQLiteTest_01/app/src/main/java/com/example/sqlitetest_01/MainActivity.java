package com.example.sqlitetest_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    SQLiteMyHelper sqLiteMyHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqLiteMyHelper = SQLiteMyHelper.getInstance(this);
        sqLiteDatabase = sqLiteMyHelper.getReadableDatabase();
        onBtn3Click(null);
    }

    public void onBtn1Click(View view) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        EditText editText = findViewById(R.id.editText);

        ContentValues contentValues = new ContentValues();
        contentValues.put("date", dateFormat.format(date));
        contentValues.put("message", editText.getText().toString());

        sqLiteDatabase.insert(sqLiteMyHelper.DB_TABLE, null, contentValues);
        Toast.makeText(this, contentValues.toString(), Toast.LENGTH_SHORT).show();
        onBtn3Click(null);
    }

    public void onBtn2Click(View view) {
        sqLiteDatabase.delete(sqLiteMyHelper.DB_TABLE, null, null);
        onBtn3Click(null);
    }

    public void onBtn3Click(View view) {
        final String[] sql1 = new String[]{"_id", "date", "message"};
        Cursor cursor = sqLiteDatabase.query(SQLiteMyHelper.DB_TABLE, sql1, null, null, null, null, null, null);
        TextView textView = findViewById(R.id.textView);
        StringBuilder stringBuilder = new StringBuilder();
        while (cursor.moveToNext()) {
            stringBuilder.append(cursor.getString(0) + "." + cursor.getString(1) + ":" + cursor.getString(2) + "\n");
        }
        textView.setText(stringBuilder.toString());
    }
}