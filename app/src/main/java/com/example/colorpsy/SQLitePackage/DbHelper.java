package com.example.colorpsy.SQLitePackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_FILE_NAME = "nadias.db";
    public static final int DB_VERSION = 1;


    public DbHelper(@Nullable Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ItemsTable.SQL_CREATE);


    }

    //We change the version of Data Base, whenever a user creates a db the old one is called.
    //wipeout the db and start over again
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ItemsTable.SQL_DELETE);
        onCreate(db);


    }


}
