//WAP to find the volume of cuboid.
//if we use public modifier we must keep the name of the file and class as same.

import java.util.*;
class Cuboid
{public int volume(int l,int b,int h)//non static mathod
    {
    return(l*b*h);
    }
public static void main(String [] args)
{
    int l,b,h,vol;
    Scanner ip=new Scanner(System.in);
    
    System.out.println("Enter the length,breadth,height: ");
    l=ip.nextInt();
    b=ip.nextInt();
    h=ip.nextInt();
    Cuboid cu=new Cuboid();//object creation
    cu.volume(l,b,h); //calling non static mathod
    vol=cu.volume(l,b,h);//callin static mathod
    System.out.printf("volume of cuboid= "+vol);
}
}