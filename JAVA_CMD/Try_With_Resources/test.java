import java.io.FileReader;

class test{
    public static void main(String[]args){
      try(FileReader f=new FileReader("/home/marko/Documents/Java_knjiga/Try_With_Resources/tek.txt"))
      {
char[]a=new char[50];
f.read(a);
for(char c:a)
System.out.println(c);
      }
      catch(Exception e){

      }
        
    }
}