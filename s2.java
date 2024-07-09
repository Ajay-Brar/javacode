// find the area of cuboid and volume

import java.util.Scanner;
class s2{
    public static void main(String[] args)
    {
     int l,b,h;
     Scanner ip=new Scanner(System.in);
     System.out.println("enter the l,b,h values ");

     l=ip.nextInt();
     b=ip.nextInt();
     h=ip.nextInt();
     System.out.println("Volume of cuboid = "+(l*b*h));
     System.out.println("Area of cuboid = "+ (2*(l*b+b*h+h*l)));
     


    }
}
