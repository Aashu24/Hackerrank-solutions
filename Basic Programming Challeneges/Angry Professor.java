import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int n,k;
        int i,j;
        for(i=0;i<t;i++)
        {
            int count=0;
            n=in.nextInt();
            k=in.nextInt();
            int[] arr = new int[n];
            for(j=0;j<n;j++)
                arr[j]=in.nextInt();
            
            
            for(j=0;j<n;j++)
            {
                if(arr[j]<=0)
                    count++;
                if(count==k)
                    break;
            }
            if(count==k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
