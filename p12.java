//WAP to find sum and average of ten number using array

import java.util.*;
class p12{
    public static void main(String[] args){
        int [] arr=new int[10];
        int i,sum=0;
        double avg;
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter ten number: ");
        for(i=0;i<10;i++){
            arr[i]=ip.nextInt();
            sum=sum+arr[i];
            }
            avg=sum/10;
            System.out.println("sum= "+sum);
            System.out.println("Avg= "+avg);

    } 
}