package String;

import java.util.Scanner;
//cts section 2 qus//
public class PrefixString {
    public int helper(String str1, String str2, int startInd2){
        // Find the length of common prefix of str1 and startInd2-shifted str2
        int result = 0;
        
        int n1 = str1.length();
        int n2 = str2.length();
        for(int i=0;i<Math.min(n1,n2);i++){
            int ind2 = (i+startInd2)%n2;
            if(str1.charAt(i)!=str2.charAt(ind2)) break;
            result++;
        }
        return result;
    }
    public int findMinRotate(String str1, String str2){
        int n2 = str2.length();
        int maxPrefix = 0;
        int minShift = -1;
                
        for(int i=0;i<n2;i++){
            int shift = Math.min(i, n2-i); // Shift to the right by i is equivalent to shift to the left by n2-i. 
            int nPrefix = helper(str1, str2, i);
            if(nPrefix > 0){
                if(nPrefix==maxPrefix){
                    minShift = Math.min(minShift, shift);
                } else if(nPrefix >maxPrefix) {
                    maxPrefix = nPrefix;
                    minShift = shift;
                }
            }
        }
        
        return minShift;
    }
    public static void main(String[] args) {
        PrefixString sol = new PrefixString();
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println(sol.findMinRotate(str1,str2));
        System.out.println("Prefix = " +  
                                str1.substring(0,str1.length())); 
        s.close();
    }
}