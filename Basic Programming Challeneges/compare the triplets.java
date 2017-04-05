import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int ascore=0,bscore=0,i;
        for(i=0;i<3;i++)
            a[i]=in.nextInt();
        for(i=0;i<3;i++)
            b[i]=in.nextInt();
        for(i=0;i<3;i++)
        {
            if(a[i]>b[i])
                ascore++;
            else if(b[i]>a[i])
                bscore++;
        }   
        System.out.print(ascore+" "+bscore);
    }
}
