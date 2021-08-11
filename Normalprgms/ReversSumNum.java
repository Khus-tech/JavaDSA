package Normalprgms;

import java.util.Scanner;

public class ReversSumNum {
    static int revers(int num){
int temp=0;
while(num!=0){
    temp=temp*10+num%10;
    num/=10;
}
return temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(revers(revers(a)+revers(b)));

        sc.close();
    }
}
