import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int t=in.nextInt();
        int[] arr = new int[n];
        int i,j,min,entry,exit;
        for(i=0;i<n;i++)
            arr[i]=in.nextInt();
        for(i=0;i<t;i++)
        {
            min=3;
            entry=in.nextInt();
            exit=in.nextInt();
            for(j=entry;j<=exit;j++)
            {
                if(arr[j]<min)
                    min=arr[j];
            }
            System.out.println(min);
        }
    }
}
