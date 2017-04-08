import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int m=5,likes=0;
        int i;
        for(i=1;i<=n;i++)
        {
            likes+=java.lang.Math.floor(m/2);
            m=(int)java.lang.Math.floor(m/2)*3;
        }
        System.out.println(likes);
    }
}
