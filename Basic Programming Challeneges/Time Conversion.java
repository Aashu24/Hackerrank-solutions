import java.io.*;
import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String inputTime = scanner.next();
        scanner.close();
        LocalTime localTime = LocalTime.parse(inputTime, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        String militaryFormattedTime = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(militaryFormattedTime);
    }
}
