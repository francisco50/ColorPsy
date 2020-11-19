package com.example.colorpsy.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.colorpsy.model.DataItem;

import java.util.List;

@Dao
public interface DataItemDao {

   @Insert
    void insertAll(List<DataItem> items);

    @Insert
    void insertAll(DataItem... items);

    @Query("SELECT COUNT(*) from dataitem")
    int countItems();

}
