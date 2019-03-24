package com.example.moodtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_emote_1  = findViewById(R.id.button_emote_1);
        final Button button_emote_2  = findViewById(R.id.button_emote_2);
        final Button button_emote_3  = findViewById(R.id.button_emote_3);
        final Button button_emote_4  = findViewById(R.id.button_emote_4);
        final Button button_emote_5  = findViewById(R.id.button_emote_5);

        final Button[] emoteArray = {button_emote_1, button_emote_2, button_emote_3, button_emote_4, button_emote_5};
        button_emote_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 1);
                log_emote(1);
                Log.d("BUTTON", "emote 1 pressed");
            }
        });
        button_emote_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 2);
                log_emote(2);
            }
        });
        button_emote_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 3);
                log_emote(3);
            }
        });
        button_emote_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                disable_buttons_Except(emoteArray, 4);
                log_emote(4);
            }
        });
        button_emote_5.setOnClickListener(new View.OnClickListener() {
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
        }
    }
}
