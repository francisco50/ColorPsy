package com.example.colorpsy.model;

import android.content.ContentValues;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.colorpsy.SQLitePackage.ItemsTable;

import java.util.UUID;

@Entity

public class DataItem {



    //THIS IS A ROOM ENTITY CLASS
    //Each of the @ColumnInfo is turned into an SQLite column in an SQLite table
    @PrimaryKey
    @NonNull
    private String itemId;
    @ColumnInfo
    private String itemName;
    @ColumnInfo
    private String description;
    @ColumnInfo
    private String category;
    @ColumnInfo
    private double price;
    @ColumnInfo
    private int sortPosition;
    @ColumnInfo
    private String image;


    @NonNull
    public String getItemName() {
        return itemName;
    }

    @NonNull
    public String getItemId() {
        return itemId;
    }

    public void setItemId(@NonNull String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(@NonNull String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSortPosition() {
        return sortPosition;
    }

    public void setSortPosition(int sortPosition) {
        this.sortPosition = sortPosition;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    public DataItem() {
    }

    @Ignore
    public DataItem(String itemId, String itemName , String category, String description, int sortPosition, double price,String image) {

        //makes sure each item has a unique primary key
        if(itemId == null)
        {
            itemId = UUID.randomUUID().toString();
        }

        this.itemId = itemId;
        this.itemName = itemName;
        this.image = image;
        this.category = category;
        this.description = description;
        this.sortPosition = sortPosition;
        this.price = price;
    }





    public ContentValues toValues()
    {
        ContentValues values = new ContentValues(7);

        values.put(ItemsTable.COLUMN_ID,itemId);
        values.put(ItemsTable.COLUMN_NAME,itemName);
        values.put(ItemsTable.COLUMN_IMAGE,image);
        values.put(ItemsTable.COLUMN_DESCRIPTION,description);
        values.put(ItemsTable.COLUMN_CATEGORY,category);
        values.put(ItemsTable.COLUMN_PRICE,price);
        values.put(ItemsTable.COLUMN_POSITION,sortPosition);


        return values;
    }


    @Override
    public String toString() {
        return "DataItem{" +
                "itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", sortPosition=" + sortPosition +
                ", image='" + image + '\'' +
                '}';
    }



}
