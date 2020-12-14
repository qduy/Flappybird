package game;

import javax.swing.*;
import java.awt.*;

public class Conchim extends JPanel {

    public static int y=200;
    public static int x = 100;


    public int getY() {
        return y;
    }


    public int getX() {
        return x;
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x,y,30,30);
    }

    public void tangY(){ //chim rơi xuống
      y++;
    }
    public void giamY(){ // chim bay lên
      y-=30;
    }
}
