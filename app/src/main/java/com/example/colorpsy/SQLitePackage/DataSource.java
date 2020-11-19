package com.example.colorpsy.SQLitePackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.colorpsy.model.DataItem;

import java.util.ArrayList;
import java.util.List;



//This is the class that works with the SQLIteHelper Class to manage the database
public class DataSource {

    private Context mContext;
    SQLiteDatabase mDatabase;
    SQLiteOpenHelper mDbHelper;


    public DataSource(Context Context) {
        this.mContext = Context;
        mDbHelper = new DbHelper(mContext);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void open()
    {
        mDatabase = mDbHelper.getWritableDatabase();
    }

    public void close()
    {
        mDbHelper.close();
    }

    public DataItem createItem(DataItem item)
    {
        ContentValues values = item.toValues();
        mDatabase.insert(ItemsTable.TABLE_ITEMS,null,values);
        return item;
    }

    //this is used to check how many items we have in our table already before inserting
    public long getDataItemsCount()
    {
        return DatabaseUtils.queryNumEntries(mDatabase,ItemsTable.TABLE_ITEMS);
    }


    public void seedDatabase(List<DataItem> dataItemList) {
        long numItems = getDataItemsCount();
        if(numItems == 0)
        {
            mDatabase.beginTransaction();
            for(DataItem item : dataItemList)
            {
                try {
                    createItem(item);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            mDatabase.setTransactionSuccessful();
            mDatabase.endTransaction();
        }

    }


    //Retrieving all data with SQLite queries
    public List<DataItem> getAllItems()
    {

        //This sorts the table with the COULUMN_NAME
        List<DataItem> dataItems = new ArrayList<>();
        Cursor cursor = mDatabase.query(ItemsTable.TABLE_ITEMS, ItemsTable.ALL_COLUMNS,null,null,null,null,ItemsTable.COLUMN_NAME);

        while (cursor.moveToNext()) {
            DataItem item = new DataItem();

            item.setItemName(cursor.getString(
                    cursor.getColumnIndex(ItemsTable.COLUMN_NAME)));
            item.setImage(cursor.getString(
                    cursor.getColumnIndex(ItemsTable.COLUMN_IMAGE)));
            item.setCategory(cursor.getString(
                    cursor.getColumnIndex(ItemsTable.COLUMN_CATEGORY)));
            item.setDescription(cursor.getString(
                    cursor.getColumnIndex(ItemsTable.COLUMN_DESCRIPTION)));
            item.setPrice(cursor.getDouble(
                    cursor.getColumnIndex(ItemsTable.COLUMN_PRICE)));
            item.setSortPosition(cursor.getInt(
                    cursor.getColumnIndex(ItemsTable.COLUMN_IMAGE)));
            dataItems.add(item);
        }

        cursor.close();
        return  dataItems;
    }
}
