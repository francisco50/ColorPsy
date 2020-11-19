package com.example.colorpsy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import com.example.colorpsy.SQLitePackage.DataSource;
import com.example.colorpsy.database.AppDatabase;
import com.example.colorpsy.model.DataItem;
import com.example.colorpsy.sample.SampleDataProvider;

import java.util.List;

import static com.example.colorpsy.sample.SampleDataProvider.dataItemList;

public class DepressedActivity extends AppCompatActivity {


    /*
    private static final int REQUEST_PERMISSION_WRITE = 1001;
    SQLiteDatabase database;
    List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    private boolean permissionGranted;

    //List<String> itemNames = new ArrayList<>();

    private AppDatabase db;
    DataSource mDataSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depressed);


        db = AppDatabase.getInstance(this);
        int itemCount = db.dataItemDao().countItems();
        if (itemCount == 0)
        {
            // List<DataItem> itemList = JSONH
        }


        mDataSource = new DataSource(this);
        mDataSource.open();
        mDataSource.seedDatabase(dataItemList);

        Toast.makeText(this, "Database Acquired! ", Toast.LENGTH_SHORT).show();

        long numItems = mDataSource.getDataItemsCount();
        if(numItems == 0) {
            for (DataItem item : dataItemList) {
                try {
                    mDataSource.createItem(item);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        else
            {
            Toast.makeText(this, "Data Already Acquired", Toast.LENGTH_SHORT).show();
        }

        List<DataItem> listFromDB = mDataSource.getAllItems();
        DataItemAdapter adapter = new DataItemAdapter(this, listFromDB);


        RecyclerView recyclerView = findViewById(R.id.recyitems1);
        recyclerView.setAdapter(adapter);


    }

    @Override
    protected void onDestroy() {
        AppDatabase.destroyInstance();
        super.onDestroy();
    }

    //This prevents database leaks
    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    //if the user closes the activity, we close and open the database to prevent database leaks
    @Override
    protected void onResume() {
        super.onResume();
        mDataSource.open();
    }

    *//* Checks if external storage is available for read and write *//*

    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    *//* Checks if external storage is available to at least read *//*

    public boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        return (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state));
    }

    // Initiate request for permissions.
    private boolean checkPermissions() {

        if (!isExternalStorageReadable() || !isExternalStorageWritable()) {
            Toast.makeText(this, "This app only works on devices with usable external storage",
                    Toast.LENGTH_SHORT).show();
            return false;
        }

        int permissionCheck = ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_PERMISSION_WRITE);
            return false;
        } else {
            return true;
        }
    }

    // Handle permissions result
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String permissions[],
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case REQUEST_PERMISSION_WRITE:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    permissionGranted = true;
                    Toast.makeText(this, "External storage permission granted",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "You must grant permission!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

*/

}