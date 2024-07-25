//WAP to demostrate concept of constructor.
import java.util.*;
class Rectangle
{
    int length;//instance variable.
    int breadth;//instance variable.
    Rectangle(int l,int b)//Costructor
    {
        length=l;
        breadth=b;
    }
    int area()
    {
        return length*breadth;
    }
}
class ClassDemo3
{
    public static void main(String [] args)
    {
        int x,y,a;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:  ");
        x=ip.nextInt();
        System.out.println("Enter the breadth of Rectangle: ");
        y=ip.nextInt();

        Rectangle r=new Rectangle(x,y);//object creation of Rectangle and calling of constructor.
        a=r.area();     //calling area mathod.
        System.out.println("Area of Rectangle= "+a);

    
    }
}