package com.example.moodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class create_post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);
        Button exit_create_button = findViewById(R.id.exit_button);
        Button save_button = findViewById(R.id.save_button);
        Button share_button = findViewById(R.id.save_share_button);
        final Button button_emote_1  = findViewById(R.id.button_emote_1);
        final Button button_emote_2  = findViewById(R.id.button_emote_2);
        final Button button_emote_3  = findViewById(R.id.button_emote_3);
        final Button button_emote_4  = findViewById(R.id.button_emote_4);
        final Button button_emote_5  = findViewById(R.id.button_emote_5);
        final Button[] emoteArray = {button_emote_1, button_emote_2, button_emote_3, button_emote_4, button_emote_5};
        final mood_handler enable_emotes = new mood_handler(emoteArray);
        exit_create_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(create_post.this, MainActivity.class));

            }
        });
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        share_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void save(){
        // save
    }
}
