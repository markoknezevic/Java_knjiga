abstract class Employee{
    private String name;
    private float ch;
    public Employee(String a,float b){
        name=a;
        ch=b;
    }
   public void Isp(){
       System.out.println("Name"+name+"Check "+ch);
   }
}