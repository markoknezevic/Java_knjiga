class test{
    public static void main(String[]args){
        AnonClass a=new AnonClass(){
            public void Fun() {
                System.out.println("Hello World");
            }
        };
        a.Fun();
    }
}