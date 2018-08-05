class test{
    public static void main(String []args)
    {
        Racun r=new Racun(500);
        try{
r.Podizanje(600);
        }
        catch(Nedovoljno e){
            e.Poruka();
        }
    }
}