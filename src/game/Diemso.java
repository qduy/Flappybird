package game;

public class Diemso {
    private static int diem=0;
    private static boolean bl =false;
    Conchim cmd= new Conchim();
    Ongnuoc ond = new Ongnuoc();

    public int getDiem() {
        return diem;
    }

    public void congdiem(){
        if (cmd.getX()+45 > ond.getX() && cmd.getX() < ond.getX()+50){
            bl =true;
        }
        if (bl==true && cmd.getX() > (ond.getX()+50)){
            diem++;
            bl = false;
        }

    }
}
