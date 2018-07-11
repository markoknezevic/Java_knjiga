import java.util.Arrays;
class test{
    public static void main(String []args){
        int []a={1,5,2,6,3,6,3};
        Arrays.sort(a);
        for(int x:a)
        System.out.println(x);
        System.out.println("\n"+Arrays.binarySearch(a,3));
    }
}