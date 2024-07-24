class Myclass
{   //public  void sayHello() "for non static mathod".
    public static void sayHello()
    {
        System.out.println("Hello World");
    }
}

 class ClassDemo1 {
    public static void main(String [] args)
    {
     //   Myclass m=new Myclass();
     //m.sayHello();
        Myclass.sayHello();
    }
    
}
