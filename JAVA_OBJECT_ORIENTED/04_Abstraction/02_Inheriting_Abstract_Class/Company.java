class Company extends Employee{
    private String code;
    public Company(String a,String b,float c){
        super(b,c);
        code=a;
    }
    public void Out(){
        System.out.println(code+" "+Get_Name()+" "+Get_Ch());
    }
}