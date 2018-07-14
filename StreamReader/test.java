import java.io.IOException;
import java.io.InputStreamReader;

class test{
    public static void main(String []args)throws IOException
    {
        try{
InputStreamReader citaj =new InputStreamReader(System.in);
char c;
do{
  c=(char)citaj.read();
  System.out.println(c);
}while(c!='q');
        }
        finally{

        }
    }
}