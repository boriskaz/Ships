package com.ltse27.ships3;

/**
 * Created by ltse27 on 11.06.15.
 */

import java.util.ArrayList;
import java.util.EnumSet;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class DrawFieldTiles extends View{
    private int screenWidth ;
    Paint paint = new Paint();

    public DrawFieldTiles(Context context) {
        super(context);
    }

    public void drawTile(Paint paintObject, Canvas canvasObject){
        paintObject.setStyle(Paint.Style.STROKE);
        paintObject.setColor(Color.CYAN);
        paintObject.setStrokeWidth(5);

        canvasObject.drawRect(10, 10, 200, 200, paintObject);
    }

    @Override
    public void onDraw(Canvas canvas) {
        drawTile(paint, canvas);


    }

}





/*public class CreateFieldTiles extends View {
    Paint paint = new Paint();

    public int upper_leftx = 50;
    public int upper_lefty = 50;
    public int lower_rightx = 130;
    public int lower_righty = 130;
    public int x;
    public int y;
    public boolean status;

    public CreateFieldTiles(Context context) {
        super(context);
    }

    public String printSomething(){

        String greeting = "Hellooo";
        return greeting;
    }



    public void drawTile(Paint paintObject, Canvas canvasObject, int upper_leftx, int upper_lefty, int lower_rightx, int lower_righty, Tile tileObject){

        paintObject.setStyle(Paint.Style.STROKE);

        //System.out.println(isShip);
        status = tileObject.getIsShipStatus();
        System.out.print(status);

        if (status = false){
            paintObject.setColor(Color.CYAN);
            System.out.print(tileObject.getIsShipStatus());
        }else if (status = true) {
            paintObject.setColor(Color.BLACK);
            //System.out.println("status %s, color black", status);
        }

        paintObject.setStrokeWidth(5);
        canvasObject.drawRect(upper_leftx, upper_lefty, lower_rightx, lower_righty, paintObject);

    }*/

   /* @Override
    public void onDraw(Canvas canvas) {

        for (x = 1; x <= 16; x += 1){

            Tile tilex= new Tile();

            drawTile(paint, canvas, upper_leftx, upper_lefty, lower_rightx, lower_righty, tilex);



            for (y = 1; y <= 16; y += 1) {

                Tile tiley = new Tile();;

                drawTile(paint, canvas, upper_leftx, upper_lefty, lower_rightx, lower_righty, tiley);
                upper_lefty += 80;
                lower_righty += 80;
                y += 1;

            }

            upper_leftx += 80 ;
            lower_rightx += 80;
            x += 1;
            upper_lefty = 50;
            lower_righty = 130;

        }


    }
}*/
