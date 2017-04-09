import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int n,i,ht;
        for(i=0;i<t;i++)
        {
            ht=1;
            n=in.nextInt();
            int j;
            for(j=1;j<=n;j++)
            {
                if(j%2==0)
                    ht++;
                else
                    ht=ht*2;
            }
            System.out.println(ht);
        }
    }
}
