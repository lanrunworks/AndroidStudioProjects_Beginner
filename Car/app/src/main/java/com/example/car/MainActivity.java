package com.example.car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    SQLiteMyHelper   sqLiteMyHelper;
    SQLiteDatabase   sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //データベースの取得
        sqLiteMyHelper = SQLiteMyHelper.getInstance(this);
        sqLiteDatabase = sqLiteMyHelper.getReadableDatabase();
        onBtn3Click(null);
    }
    public void onBtn1Click(View view){
        //日付時間文字列の取得
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date(System.currentTimeMillis());
        //リソースの取得
        Spinner spinner = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);
        //ContentValuesオブジェクトの作成とデータの登録
        ContentValues contentValues = new ContentValues();
        //contentValues.put("date", dateFormat.format(date));
        contentValues.put("OfficeName",spinner.getSelectedItem().toString());
        contentValues.put("CarName",spinner2.getSelectedItem().toString());
        //データの登録
        sqLiteDatabase.insert(sqLiteMyHelper.DB_TABLE,null,contentValues);
        Toast.makeText(this, contentValues.toString(),Toast.LENGTH_SHORT).show();
        onBtn3Click(null);
    }
    public void onBtn2Click(View view){
        sqLiteDatabase.delete(sqLiteMyHelper.DB_TABLE,null,null);
        onBtn3Click(null);
    }
    public void onBtn3Click(View view){
        final String[] sql1 = new String[]{"_id","OfficeName","CarName"};
        //kennsaku no jikkou kekka ha Cursor Object
        Cursor cursor = sqLiteDatabase.query(SQLiteMyHelper.DB_TABLE, sql1, null,
                null, null, null, null, null);
        TextView textView = findViewById(R.id.textView4);
        textView.setMovementMethod(new ScrollingMovementMethod());
        StringBuilder stringBuilder = new StringBuilder();
        //
        while(cursor.moveToNext()){
            stringBuilder.append(cursor.getString(0) + ".  " + cursor.getString(1) + ":  " + cursor.getString(2) + "\n" );
            //stringBuilder.append(String.format("%-4.4s. %-10.10s:  %-10.10s \n",cursor.getString(0),cursor.getString(1),cursor.getString(2)));

        }
        textView.setText(stringBuilder.toString());
        cursor.close();
    }
    public void d_gokei01(View v){
        String order_by = "OfficeName DESC"; //ソートしたい値,昇順(ASC)か降順(DESC)か
        final String[] sql1 = new String[]{"_id","OfficeName","CarName"};
        //
        Cursor cursor = sqLiteDatabase.query(SQLiteMyHelper.DB_TABLE, sql1, null,
                null, null, null, order_by, null);
        TextView textView = findViewById(R.id.textView4);
        textView.setMovementMethod(new ScrollingMovementMethod());
        StringBuilder stringBuilder = new StringBuilder();
        //
        String gKey="";
        int cnt=0;
        while(cursor.moveToNext()){
            if(gKey.equals("") || gKey.equals(cursor.getString(1))) {
                stringBuilder.append(cursor.getString(0) + ".  " + cursor.getString(1) + ":  " +
                        cursor.getString(2) + "\n");
                gKey = cursor.getString(1);
                cnt++;
            }
            else{
                stringBuilder.append("               \t" + gKey + ". gokei = " + cnt + "\n");
                stringBuilder.append(cursor.getString(0) + ".  " + cursor.getString(1) + ":  " +
                        cursor.getString(2) + "\n");
                gKey = cursor.getString(1);
                cnt=1;
            }
        }
        stringBuilder.append("               \t" + gKey + ". gokei = " + cnt + "\n");
        textView.setText(stringBuilder.toString());
        cursor.close();
    }
}
