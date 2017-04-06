import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int high=0,low=0,max,min;
        int[] score = new int[n];
        score[0]=in.nextInt();
        max=min=score[0];
        for(int score_i=1; score_i < n; score_i++){
            score[score_i] = in.nextInt();
            if(score[score_i]>max)
                {
                max=score[score_i];
                high++;
            }
            if(score[score_i]<min)
                {
                min=score[score_i];
                low++;
            }
        }
        // your code goes here
        System.out.print(high+" "+low);
    }
}
