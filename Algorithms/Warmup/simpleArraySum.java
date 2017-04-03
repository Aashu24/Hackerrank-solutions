//Hackerrank Solutions
//Algorithms
//Warmup
//Simple Array Sum


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum+=arr[i];
        }    
        System.out.println(sum);
    }
}
