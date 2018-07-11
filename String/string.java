class string{
    public static void main(String []args)
    {
        StringBuilder a=new StringBuilder("Marko");
        test2 d=new test2("dddd");
        a.append(d);
        System.out.println(a);
        StringBuilder bb=new StringBuilder("marko");
        System.out.println(bb.capacity());
        String str=new String("marko");
        System.out.println(str.toUpperCase());
    }
}