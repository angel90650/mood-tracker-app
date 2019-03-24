package com.example.moodtracker;


import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class mood_handler  {

    public mood_handler(final Button[] emoteArray){

        emoteArray[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 1);
                log_emote(1);
                Log.d("BUTTON", "emote 1 pressed");
            }
        });
        emoteArray[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 2);
                log_emote(2);
            }
        });
        emoteArray[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 3);
                log_emote(3);
            }
        });
        emoteArray[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 4);
                log_emote(4);
            }
        });
        emoteArray[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 5);
                log_emote(5);
            }
        });
    }

    public void log_emote(int emote) {
        //save the emote that was logged

    }
    public void disable_buttons_Except(Button[] array, int button_number) {
        switch(button_number)
        {
            case 1:
                array[1].setEnabled(false);
                array[2].setEnabled(false);
                array[3].setEnabled(false);
                array[4].setEnabled(false);
            case 2:
                array[0].setEnabled(false);
                array[2].setEnabled(false);
                array[3].setEnabled(false);
                array[4].setEnabled(false);
            case 3:
                array[1].setEnabled(false);
                array[0].setEnabled(false);
                array[3].setEnabled(false);
                array[4].setEnabled(false);
            case 4:
                array[1].setEnabled(false);
                array[2].setEnabled(false);
                array[0].setEnabled(false);
                array[4].setEnabled(false);
            case 5:
                array[1].setEnabled(false);
                array[2].setEnabled(false);
                array[3].setEnabled(false);
                array[0].setEnabled(false);
            default:
                array[0].setEnabled(false);
                array[1].setEnabled(false);
                array[2].setEnabled(false);
                array[3].setEnabled(false);
                array[4].setEnabled(false);
        }
    }
}
