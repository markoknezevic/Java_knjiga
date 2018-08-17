
import java.util.Date;
class test{
public static void main(String []args){
SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
Date d;
String s=args.length==0?"1818-11-11":args[0];

d=f.parse(s);
System.out.println(d);
}
}