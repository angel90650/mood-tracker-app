package com.example.moodtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class databaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "dailyEntries";
    private static final String TABLE_DATES = "dates";
    private static final String KEY_DAY = "day";
    private static final String KEY_METERVAL = "meterVal";
    private static final String KEY_EMOTION = "emotion";
    private static final String KEY_ACTIVITY = "activity";
    private static final String KEY_JOURNAL = "journalEntry";

    //constructor
    public databaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_DATES_TABLE = "CREATE TABLE " + TABLE_DATES + "(" + KEY_DAY + "INTEGER PRIMARY KEY," + KEY_METERVAL + "TEXT," + KEY_EMOTION + "TEXT," + KEY_ACTIVITY + "TEXT," + KEY_JOURNAL + "TEXT" + ")";
        db.execSQL(CREATE_DATES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DATES);
        onCreate(db);
    }

    void addDate(Day day){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_DAY, day.getDate());
        values.put(KEY_METERVAL, day.getMeterVal());
        values.put(KEY_EMOTION, day.getEmotion());
        values.put(KEY_ACTIVITY, day.getActivity());
        values.put(KEY_JOURNAL, day.getJournalEntry());

        db.insert(TABLE_DATES, null, values);
        db.close();
    }

    Day getDate(int date) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_DATES, new String[]{KEY_DAY, KEY_METERVAL, KEY_EMOTION, KEY_ACTIVITY, KEY_JOURNAL}, KEY_DAY + "=?", new String[]{String.valueOf(date)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Day day = new Day(Integer.parseInt(cursor.getString(0)), Integer.parseInt(cursor.getString(1)), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        return day;
    }

}
