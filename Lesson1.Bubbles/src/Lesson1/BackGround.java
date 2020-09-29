package Lesson1;

import java.awt.*;

public class BackGround{

    private static int red = ranNum(), green = ranNum(), blue = ranNum();

    private static int ranNum(){
        int num = (int)Math.random()*255;
        return num;
    }

    BackGround(GameCanvas canvas) {
        canvas.setBackground(bgColor());
        }

        private static Color bgColor(){
        red++;
        green++;
        blue=blue+2;
        if(red >= 255){red = ranNum();}
        else if(green >= 255){green = ranNum();}
        else if(blue >= 255){blue = ranNum();}

        if(red==255 || green ==255 || blue == 255){
            return new Color(red=ranNum(), green=ranNum(), blue=ranNum());
        }
            return new Color(red, green, blue);

    }
}
