import java.text.SimpleDateFormat;
import java.util.Date;
class test{
    public static void main(String []args)
    {
      
        SimpleDateFormat s=new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss zzz");
        while(true){
            Date d=new Date();
        System.out.println(s.format(d));
        }
    }
}