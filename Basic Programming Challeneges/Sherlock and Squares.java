import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int i,count;
		for(i=0;i<t;i++)
		{
			count=0;
			double a=in.nextDouble();
			double b=in.nextDouble();
			a=Math.ceil(Math.sqrt(a));
			b=Math.floor(Math.sqrt(b));
			count=(int)(b-a+1);
			System.out.println(count);
		}
		in.close();
	}
}
