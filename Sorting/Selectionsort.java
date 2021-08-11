package Sorting;

import java.util.Scanner;

public class Selectionsort {
    public static void sort(int[] arr,int n) {
      
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp;
            System.out.print(arr[i]+" "); 
        } 
        
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = s.nextInt();
        }
        Selectionsort.sort(arr,n);
        s.close();
}
}
