import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,n,m,s;
        Scanner in = new Scanner(System.in);
        int i,j;
        t=in.nextInt();
        for(i=0;i<t;i++)
        {
            n=in.nextInt();
            m=in.nextInt();
            s=in.nextInt();
            j=(m+s-1)%n;
            if(j==0)
                System.out.println(n);
            else
                System.out.println(j);
        }
        
    }
}
