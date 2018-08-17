class Klasa{
    void Fun(){
        class Inner{
            void Isp(){
                System.out.println("Hello World");
            }
          

        }
        Inner c=new Inner();
        c.Isp();
    }
    
    
}