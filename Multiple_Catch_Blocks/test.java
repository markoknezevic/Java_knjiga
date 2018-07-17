class test{
    public static void main(String[]args){
        try{
            int []a={1,2,3};
            System.out.print(a[2]/0);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Presao si granicu ");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Deljenje sa 0");
        }
    }
}