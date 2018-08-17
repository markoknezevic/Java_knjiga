import java.io.File;


class test{
    public static void main(String []args){
        String name="/home/marko/Documents/Java_knjiga/Directories/aaa";
        File d=new File(name);
        d.mkdir();
    }
}