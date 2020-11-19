package com.example.colorpsy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView angry , sad , depressed, nervous, test1, test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









    }


    public void AngryCard(View view) {
        Intent intent = new Intent(MainActivity.this, AngryActivity.class);
        startActivity(intent);
    }

    public void DepressedCard(View view) {
        Intent intent = new Intent(MainActivity.this, DepressedActivity.class);
        startActivity(intent);
    }

    public void NervousCard(View view) {
        Intent intent = new Intent(MainActivity.this, NervousActivity.class);
        startActivity(intent);
    }

    public void SadCard(View view) {
        Intent intent = new Intent(MainActivity.this, SadActivity.class);
        startActivity(intent);
    }

    public void Ontest1(View view) {
    }

    public void onTest1(View view) {
    }
}