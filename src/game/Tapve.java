package game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tapve extends JPanel implements Runnable{

     Conchim cm = new Conchim();
     Ongnuoc onc = new Ongnuoc();
     Kiemtra kt = new Kiemtra();
     Diemso cd = new Diemso();

     private BufferedImage bg, nendat;

     Thread threadTV;
    public Tapve(){
        threadTV = new Thread(this);
        threadTV.start();
    }

    public void paint(Graphics g){
        //nền toàn màn hình
        /*g.setColor(Color.CYAN);
        g.fillRect(0,0,getWidth(),getHeight());*/
        try {
            bg = ImageIO.read(new File("src\\sky.jpg"));
            g.drawImage(bg,0,0,null);


            onc.paint(g);

            //nền đất
            /*g.setColor(Color.GRAY);
            g.fillRect(0,420,getWidth(),80);
            g.setColor(Color.GREEN);
            g.fillRect(0,400,getWidth(),20);*/
            nendat =ImageIO.read(new File("src\\nendat.jpg"));
            g.drawImage(nendat,0,400,null);

            cm.paint(g);

            //hiển thị điểm
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Score: "+cd.getDiem(),10,30);
        } catch (IOException e) {
            e.printStackTrace();
        }
       /* //ống
        onc.paint(g);
        //nền đất
        g.setColor(Color.GRAY);
        g.fillRect(0,420,getWidth(),80);
        g.setColor(Color.GREEN);
        g.fillRect(0,400,getWidth(),20);

        cm.paint(g);

        //hiển thị điểm
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Score: "+cd.getDiem(),10,30);*/
    }
    public static void main(String[] args) {

    }

    @Override
    public void run() {
       while (true){ // giá trị true giúp vòng lập lập vô hạn
           repaint();
           onc.giamX();
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           onc.laplaiX();

           cm.tangY();

           if (kt.chet()==true){
               threadTV.stop();
           }
           cd.congdiem();
           //System.out.println(cd.congdiem());


       }
    }
}
