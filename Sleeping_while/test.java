import java.awt.desktop.SystemSleepEvent;

import java.util.Date;
class test{
    public static void main(String []args){
        try{
        System.out.println("Marko");
        Thread.sleep(5000);
        System.out.println("Knezevic");
        }
        catch(Exception e){
            System.out.println("GRESKA");
        }
    }

}