class test{
    public static Double Suma(double...a){
        double s=0;
for(int i=0;i<a.length;i++){
s+=a[i];
}
return s;
    }
    public static void main(String[]args){
System.out.println(Suma(4,2,1));
System.out.println(Suma(4,2,1,2));
    }
}