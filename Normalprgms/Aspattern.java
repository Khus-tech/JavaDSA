package Normalprgms;

import java.util.*;
public class Aspattern
{
public static void main(String[] args)
{
int n, i, j;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(i = 0; i < n; i++)
{
for(j = 0; j <= i; j++)
{
System.out.print("* ");
}
System.out.print("\n");
}
}
}