package Normalprgms;

import java.util.Scanner;

public class LocktoUnlock {
   public static void main (String[]args) {  
    int[] b=new int[15];    
    int a,i=0,t,s,h,n=0;
       Scanner sc= new Scanner(System.in);
       a=sc.nextInt();
       while(a!=0){
           b[i++]=a%10;
           a/=10;
           n++;
       }
       for(s=0;s<n;s++){
           for(h=s+1;h<n;h++){
               if(b[s]>b[h]){
                   t=b[s];
                   b[s]=b[h];
                   b[h]=t;
               }
           }
       }
       for(i=0;i<n;i++){
           System.out.print(b[i]+" ");
           
       }

       
   } 
}
