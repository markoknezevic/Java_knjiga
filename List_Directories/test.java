import java.io.File;

class test{
    public static void main(String[]args)
    {
        try{
        File a=new File("/home/marko/Documents/Java_knjiga/List_Directories");
        String[] str;
        str=a.list();
    for(String s:str)
    System.out.println(s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}