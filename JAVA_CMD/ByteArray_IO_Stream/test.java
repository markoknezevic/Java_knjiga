import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class test {
    public static void main(String []args)throws IOException {
ByteArrayOutputStream a=new ByteArrayOutputStream(12);

while((a.size())!=10)
a.write(System.in.read());
     byte b[]=a.toByteArray();
    for(int i=0;i<b.length;i++)
    System.out.print((char)b[i]);
    }
}