package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ongnuoc extends JPanel {

    private static int x1 = 500,x2 = x1+320;
    public static int h1,h2;
    private static boolean bl1= false;
    private static boolean bl2= false;

    public void ngaunhien(){
        Random rd = new Random();
        if (bl1==false){
            h1 = rd.nextInt(200);
            bl1 = true;
        }
        if (bl2==false){
            h2= rd.nextInt(200);
            bl2 =true;
        }
    }

    public int getH1() {
        return h1;
    }

    public int getH2() {
        return h2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public void paint(Graphics g){
        ngaunhien();
        //cặp ông 1
        g.setColor(Color.green);
        g.fillRect(x1,0,50,h1);

        g.setColor(Color.green);
        g.fillRect(x1,h1+100,50,500);
        //cặp ống 2
        g.setColor(Color.green);
        g.fillRect(x2,0,50,h2);

        g.setColor(Color.green);
        g.fillRect(x2,h2+100,50,500);
    }
    public void giamX(){
        x1--;
        x2--;
    }
    public void laplaiX(){
        if (x1==-50){
            x1 = 500;
            bl1 = false;
        }
        if (x2==-50){
            x2 = 500;
            bl2 = false;
        }
    }
}
