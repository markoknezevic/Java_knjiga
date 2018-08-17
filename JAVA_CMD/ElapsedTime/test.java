class test{
    public static void main(String []args){
        try{
        System.out.println("aaa");
        long a=System.currentTimeMillis();
        Thread.sleep(5000);
        System.out.println("aaa");
        long b=System.currentTimeMillis();
        System.out.println(b-a);
    }
        catch(Exception e){
            System.out.println("dddd");
        }

    }
}