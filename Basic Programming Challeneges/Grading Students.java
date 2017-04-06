import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m;
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if(grade>=38)
            {
              m=grade;
              while(m%5!=0)
                  m++;
              if(m-grade<3)
                  grade=m;
            }
            System.out.println(grade);
        }
    }
}
