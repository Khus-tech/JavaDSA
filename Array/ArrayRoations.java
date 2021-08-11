package Array;
import java.util.*;
public class ArrayRoations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n;i++) {
            array[(i+n-d)%n] = scan.nextInt();//leftroation
            //array[(i+n+d)%n]=scan.nextInt();//rightroation
        }
        for(int i=0; i<n;i++) {
            System.out.print(array[i] + " ");
        }
        scan.close();      
    }
}