package com.example.car;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteMyHelper extends SQLiteOpenHelper {
    private static SQLiteMyHelper instance = null;
    private static final String DB_NAME = "car_data.db";  // DB名
    private static final int DB_VERSION = 4;  //バージョン
    public  static final String DB_TABLE = "tblCarUriage";
    public SQLiteMyHelper(@Nullable Context context, @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table if not exists " + DB_TABLE
                + "(_id integer primary key autoincrement, "
                + "OfficeName text,CarName text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + DB_TABLE);
        onCreate(sqLiteDatabase);
    }
    public static SQLiteMyHelper getInstance(Context context){
        if(instance == null){
            instance = new SQLiteMyHelper(context, DB_NAME, null, DB_VERSION);
        }
        return instance;
    }
}