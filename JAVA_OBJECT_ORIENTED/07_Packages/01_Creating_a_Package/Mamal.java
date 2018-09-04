package animal;
public class Mamal implements Animal{
    public void eat(){
        System.out.println("Mamals eat");
    }
    public void travel(){
        System.out.println("Mamal travel");
    }

    public static void main(String []args){
        Mamal a=new Mamal();
        a.eat();
        a.travel();
    }
}