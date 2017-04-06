import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int min=a[n-1];
        int max=b[0];
        int i,count=0;
        for(i=min;i<=max;i++)
        {
            if(hasFactors(i,a)&&isFactor(i,b))
                count++;
        }
        System.out.println(count);
    }
    public static boolean hasFactors(int num, int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(num%a[i]!=0)
                return false;
        }
        return true;
    }
    public static boolean isFactor(int num, int[] b)
    {
        for(int i=0;i<b.length;i++)
        {
            if(b[i]%num!=0)
                return false;
        }
        return true;
    }
}
