
//WAP to show the overloading 
//mathod having same name of mathod but different parameters is called mathod overloading. 
import java.util.*;

class Figure {
    public int area(int s) {
        return s * s;
    }

    public int area(int l, int b) {
        return l * b;
    }
}

class OverloadingDemo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int s, l, b, a1, a2;
        Figure fig = new Figure();
        System.out.println("Enter the side : ");
        s = ip.nextInt();
        a1 = fig.area(s);
        System.out.println("Area of Square : " + a1);
        System.out.println("Enter the length :  ");
        l = ip.nextInt();
        System.out.println("Enter the Breadth :  ");
        b = ip.nextInt();
        a2 = fig.area(l, b);
        System.out.println("Area of Recrangle : " + a2);

    }
}