import java.util.Scanner;
public class Number
{
	public static void main(String args[])
	{
		String one,two;
		Scanner sc = new Scanner(System.in);
		one = sc.next();
		 two = sc.next();
		int c = Integer.parseInt(one) + Integer.parseInt(two);
		System.out.println("The sum of two string number "+c);
	}
}