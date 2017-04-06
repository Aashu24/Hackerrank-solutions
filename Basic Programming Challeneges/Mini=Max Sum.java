import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] sum = new long[5];
        sum[0]=a+b+c+d;
        sum[1]=b+c+d+e;
        sum[2]=a+c+d+e;
        sum[3]=a+b+d+e;
        sum[4]=a+b+c+e;
        long min,max;
        int i;
        min=max=sum[0];
        for(i=0;i<5;i++)
            {
            if(sum[i]<min)
                min=sum[i];
            if(sum[i]>max)
                max=sum[i];
        }
        System.out.println(min+" "+max);
    }
}
