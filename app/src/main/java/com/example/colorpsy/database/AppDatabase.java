package com.example.colorpsy.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.colorpsy.model.DataItem;

//Here we add all our Entity classes and separate them by commas
//so far we have 2 classes or entities so i pass them
@Database(entities = {DataItem.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public abstract DataItemDao dataItemDao();
    public static AppDatabase getInstance(Context context)
    {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class,"app-database")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public static void destroyInstance()
    {
        instance = null;
    }


}
