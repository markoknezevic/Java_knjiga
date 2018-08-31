class Sub extends Sup{
    public float check;
    public Sub(String b,float a){
        super(b);
        check=a;
    }
    public void Fun(){
        System.out.println("Name : "+Get_Name()+" Check: "+check);
    }
}