class Sub extends Sup{
    int age;
    public Sub(int a,int b){
        super(b);
        age=a;

    }
    public void Out(){
       System.out.println(age+" "+ super.age);
    }
    
}