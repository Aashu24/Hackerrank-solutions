//Hackerrank-solutions
//Algorithms
//Warmup
//Diagonal Difference


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j,sum1=0,sum2=0;
        int[][] arr=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                arr[i][j]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    sum1+=arr[i][j];
                if((i+j)==(n-1))
                    sum2+=arr[i][j];
            }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
