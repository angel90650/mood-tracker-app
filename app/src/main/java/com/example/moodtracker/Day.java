package com.example.moodtracker;

public class Day {

    //fields
    private int date;
    private int meterVal;
    private String emotion;
    private String activity;
    private String journalEntry;

    //constructors
    public Day() {}
    public Day(int date, int meterVal, String emotion, String activity, String journalEntry){
        this.date = date;
        this.meterVal = meterVal;
        this.emotion = emotion;
        this.activity = activity;
        this.journalEntry = journalEntry;
    }

    //properties

    //setters
    public void setDate(int date){
        this.date = date;
    }
    public void setMeterVal(int meterVal){
        this.meterVal = meterVal;
    }

    public void setEmotion(String emotion){
        this.emotion = emotion;
    }

    public void setActivity(String activity){
        this.activity = activity;
    }

    public void setJournalEntry(String journalEntry){
        this.journalEntry = journalEntry;
    }

    //getters
    public int getDate(){
        return this.date;
    }

    public int getMeterVal(){
        return this.meterVal;
    }

    public String getEmotion(){
        return this.emotion;
    }

    public String getActivity(){
        return this.activity;
    }

    public String getJournalEntry(){
        return this.journalEntry;
    }


}
