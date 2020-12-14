package game;

public class Kiemtra {
    Conchim ktcm = new Conchim();
    Ongnuoc kton = new Ongnuoc();
    public boolean chet(){
        //khi chạm đất
        if(ktcm.getY()+30>=400){
        return  true;
        }
        //khi chạm cặp ống 1
        if (ktcm.getY()<=kton.getH1()&&(((ktcm.getX()+30)>=kton.getX1()))&& ktcm.getX()<=(kton.getX1()+50)){
            return true;
        }
        if ((ktcm.getY()+30)>=(kton.getH1()+100)&&((ktcm.getX()+30)>=kton.getX1()&&ktcm.getX()<=(kton.getX1()+50))){
            return true;
        }
        //khi chạm cặp ống 2
        if (ktcm.getY()<=kton.getH2()&&(((ktcm.getX()+30)>=kton.getX2()))&& ktcm.getX()<=(kton.getX2()+50)){
            return true;
        }
        if ((ktcm.getY()+30)>=(kton.getH2()+100)&&((ktcm.getX()+30)>=kton.getX2()&&ktcm.getX()<=(kton.getX2()+50))){
            return true;
        }


        return false;
    }
}
