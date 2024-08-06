import java.util.*;
import mypack.MyUtil;
class Test {
    public static void main(String [] args){
        int a,b,s,g;
        Scanner ip=new Scanner(System.in);
        MyUtil mu=new MyUtil();
        System.out.print("enter first no.= ");
        a=ip.nextInt();
        System.out.print("enter second no.= ");
        b=ip.nextInt();
        s=mu.add(a,b);
        g=mu.greater(a,b);
        System.out.println("Sum = "+s);
        System.out.println("Greater = "+g);






    }
}
