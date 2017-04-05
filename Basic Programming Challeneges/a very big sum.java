import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long[] arr=new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
