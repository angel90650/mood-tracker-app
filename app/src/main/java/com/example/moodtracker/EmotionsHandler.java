package com.example.moodtracker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class EmotionsHandler {
    Button[] emotionbuttons;
    Context classcontext;
    Drawable active;
    Drawable inactive;

    public EmotionsHandler(Context context, Button[] buttons){
        emotionbuttons = buttons;
        classcontext = context;
        Drawable active = ContextCompat.getDrawable(context, R.drawable.buttonboxlong);
        Drawable inactive = ContextCompat.getDrawable(context, R.drawable.buttonboxlonginact);
        emotionbuttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("button", "pressed 0 button");
                setInactive(0);
                //setOthersActive(0);
            }
        });
        emotionbuttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("button", "pressed 1 button");
                setInactive(1);
                //setOthersActive(1);
            }
        });
        emotionbuttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("button", "pressed 2 button");
                setInactive(2);
                //setOthersActive(2);
            }
        });
        emotionbuttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("button", "pressed 3 button");
                setInactive(3);
                //setOthersActive(3);
            }
        });
        emotionbuttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("button", "pressed 4 button");
                setInactive(4);
                //setOthersActive(4);
            }
        });
        emotionbuttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("button", "pressed 5 button");
                setInactive(5);
                //setOthersActive(5);
            }
        });
    }

    public void setInactive(int btnNum){
        emotionbuttons[btnNum].setBackground(inactive);
        emotionbuttons[btnNum].setTextAppearance(classcontext, R.style.inactive);
    }
    public void setActive(int btnNum){
        emotionbuttons[btnNum].setBackground(active);
        emotionbuttons[btnNum].setTextAppearance(classcontext, R.style.white);
    }
    public void setOthersActive(int num){
         switch(num) {
             case 0:
                 setActive(1);
                 setActive(2);
                 setActive(3);
                 setActive(4);
                 setActive(5);
             case 1:
                 setActive(0);
                 setActive(2);
                 setActive(3);
                 setActive(4);
                 setActive(5);
             case 2:
                 setActive(1);
                 setActive(0);
                 setActive(3);
                 setActive(4);
                 setActive(5);
             case 3:
                 setActive(1);
                 setActive(2);
                 setActive(0);
                 setActive(4);
                 setActive(5);
             case 4:
                 setActive(1);
                 setActive(2);
                 setActive(3);
                 setActive(0);
                 setActive(5);
             case 5:
                 setActive(1);
                 setActive(2);
                 setActive(3);
                 setActive(4);
                 setActive(0);
         }
    }
}
