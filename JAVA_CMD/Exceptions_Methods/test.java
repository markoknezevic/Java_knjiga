class test{
    public static void main(String [] args){
        Throwable a=new Throwable();
        try{
int []b={1,2,3};
System.out.println(b[5]);
        }
        catch(Exception e){

a.getCause();
System.out.println(a.getMessage());
a.printStackTrace();
System.out.println(a.toString());
System.out.println(e);
        }
    }
}