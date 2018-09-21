import java.util.*;
class test{
    public static void main(String []args){
        Vector v=new Vector();
        System.out.println(v.size());
        v.addElement(4);
        v.addElement(2);
        v.addElement(5);
        v.addElement(7);
        System.out.println(v.size());
        Enumeration ve=v.elements();
        while (ve.hasMoreElements()){
            System.out.println(ve.nextElement());
        } 
            
        }
    }
