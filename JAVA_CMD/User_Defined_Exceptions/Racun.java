class Racun{
    public int kol;
    public Racun(int a)
    {
        kol=a;
    }
    public void Podizanje(int a)throws Nedovoljno{
        if(kol<a)
        {
            int b=a-kol;
            throw new Nedovoljno(b);
        }
        else
        kol=kol-a;
    }
}