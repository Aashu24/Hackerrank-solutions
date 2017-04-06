import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        n = in.nextInt();
        k = in.nextInt();
        int[] c = new int[n];
        int i,bill=0,charged;
        for(i=0;i<n;i++)
            c[i]=in.nextInt();
        charged = in.nextInt();
        in.close();
        for(i=0;i<n;i++)
        {
            if(i!=k)
                bill=bill+c[i];
        }
        bill=bill/2;
        if(bill==charged)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged-bill);
    }
}
