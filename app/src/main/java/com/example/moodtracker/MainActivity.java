package com.example.moodtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHandler db = new databaseHandler(this);

        Log.d("Insert:", "Inserting..");
        db.addDate(new Day(1, 2, "happy", "running", "I am very happy today"));
    }
}
