package com.example.moodtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import com.jjoe64.graphview.*;
import com.jjoe64.graphview.series.*;
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
        mood_handler enable_emotes = new mood_handler(emoteArray);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);

    }




}
