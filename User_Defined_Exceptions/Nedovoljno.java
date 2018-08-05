class Nedovoljno extends Exception{
    public int a;
    public Nedovoljno(int b){
        a=b;
    }
    public void Poruka()
    {
        System.out.println("Nedovoljno novca treba ti jos "+a);
    }

}