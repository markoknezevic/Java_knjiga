import java.util.Vector;
import java.util.Enumeration;

class test{
    public static void main(String[]args){
    Vector v=new Vector();
    Enumeration e;
    v.add("Pon");
    v.add("Uto");
    v.add("Sre");
    v.add("Cet");
    v.add("Pet");
    v.add("Sub");
    v.add("Ned");
e=v.elements();
while(e.hasMoreElements())
System.out.println(e.nextElement());
    }
}