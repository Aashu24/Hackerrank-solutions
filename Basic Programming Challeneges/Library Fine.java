import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int rday=in.nextInt();
        int rmon=in.nextInt();
        int ryear=in.nextInt();
        int eday=in.nextInt();
        int emon=in.nextInt();
        int eyear=in.nextInt();
        int fine;
        if(ryear<eyear)
            fine=0;
        else if(ryear>eyear)
            fine=10000;
        else if(rmon<emon)
            fine=0;
        else if(rmon>emon)
            fine=500*(rmon-emon);
        else if(rday<eday)
            fine=0;
        else
            fine=15*(rday-eday);
        System.out.println(fine);
    }
}
