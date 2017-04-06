import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,k;
        int[] types = new int[n];
        int[] arr = new int[5];
        for(i=0;i<5;i++)
            arr[i]=0;
        for(int types_i=0; types_i < n; types_i++){
            k=types[types_i] = in.nextInt();
            arr[k-1]++;
        }
        // your code goes here
        int max=arr[0];
        int pos=0;
        for(i=1;i<5;i++)
            {
            if(arr[i]==max)
                {
                if(i<pos)
                    {
                max=arr[i];
                    pos=i;
                }
            }
            else if(arr[i]>max)
                {
                max=arr[i];
                pos=i;
            }
        }
        pos++;
        System.out.println(pos);
    }
}
