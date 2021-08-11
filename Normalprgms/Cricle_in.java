package Normalprgms;

import java.util.Scanner;

public class Cricle_in {
    public static void main(String[] args){

    Scanner s=new Scanner(System.in);
   int radius1=s.nextInt();
    int radius2=s.nextInt();
    int distance=s.nextInt();
s.close();
    Double r = (double) radius1;
Double R = (double) radius2;
Double d = (double) distance;
if(R < r){
    // swap
    r = (double) radius2;
    R = (double) radius1;
}
Double part1 = r*r*Math.acos((d*d + r*r - R*R)/(2*d*r));
Double part2 = R*R*Math.acos((d*d + R*R - r*r)/(2*d*R));
Double part3 = 0.5*Math.sqrt((-d+r+R)*(d+r-R)*(d-r+R)*(d+r+R));

Double intersectionArea = part1 + part2 - part3;
System.out.println(intersectionArea);
}
}
