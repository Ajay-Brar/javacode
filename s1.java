// WAP find the area of ractangle and parameter
import java.util.Scanner;
class s1
{
    public static void main(String[] args)
    {
        int l,b,h;
        Scanner ip=new Scanner(System.in);
        
        System.out.printf("enter l: ");
        l=ip.nextInt();

        System.out.printf("enter b: ");
        b=ip.nextInt();

        System.out.printf("enter h: ");
        h=ip.nextInt();
        
        System.out.println("Area="+(l*b));
        System.out.println("parameter="+(2*(l+b)));
    }
}