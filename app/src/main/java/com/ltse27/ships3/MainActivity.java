package com.ltse27.ships3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

/**
 * Created by ltse27 on 11.06.15.
 */
public class MainActivity extends Activity {
    DrawFieldTiles drawView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        drawView = new DrawFieldTiles(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);

    }
}
