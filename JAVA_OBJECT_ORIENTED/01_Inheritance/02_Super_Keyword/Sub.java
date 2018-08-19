class Sub extends Sup{
    public int a=1;
    public void Out(){
        System.out.println("World");
    }
    public void Fun(){
        System.out.println(a);
        System.out.println(super.a);
        super.Out();
        Out();
      
    }
}