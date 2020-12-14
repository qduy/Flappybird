package game;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Manhinh extends JFrame {
    Tapve tv =new Tapve();
    Conchim cm = new Conchim();
    public Manhinh() {

         setSize(500,500);
         setVisible(true);
         setLocation(400,100); //vị trí màn hình
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         add(tv);

         addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) {
                 // khi bấm vào bàn phím
                 cm.giamY();
             }
         });

    }



    public static void main(String[] args) {
        Manhinh mh = new Manhinh();
    }
}
