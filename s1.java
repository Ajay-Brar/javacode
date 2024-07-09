// WAP find the area of ractangle and parameter
import java.util.Scanner;
class s1
{
    public static void main(String[] args)
    {
        int l,b,h;
        Scanner ip=new Scanner(System.in);
        System.out.println(3"enter the l,b,h ");

        l=ip.nextInt();
        b=ip.nextInt();
        h=ip.nextInt();
        
        System.out.println("Area="+(l*b));
        System.out.println("parameter="+(2*(l+b)));
    }
}