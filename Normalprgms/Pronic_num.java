package Normalprgms;

import java.util.Scanner;

public class Pronic_num {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("INPUT A NUMBER:");
        int n = in.nextInt();
        in.close();
        int square = (int)Math.sqrt(n);
        int product = square * (square + 1);
        if(product == n){
        System.out.println("PRONIC NUMBER");
        } else
        System.out.println("NOT PRONIC");
}
}
