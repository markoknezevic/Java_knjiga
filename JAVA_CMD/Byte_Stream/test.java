import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class test{
    public static void main(String []args)throws IOException
    {
        try{
FileInputStream in=new FileInputStream("tek.txt");
FileOutputStream out=new FileOutputStream("Out.txt");
int c;
while((c=in.read())!=-1)
out.write(c);
        }
        finally{

        }
    }
}