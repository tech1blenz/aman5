import java.util.Scanner;
public class revString
{
	public static String reverse(String a)
	{
		int n = a.length();
		char []c = a.toCharArray();
		for(int i = 0; i < n/2; i++)
		{
			char temp = c[i];
			c[i] = c[n - i - 1];
			c[n - i - 1] = temp; 
		}
		a = String.valueOf(c);
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		String x = reverse(c);
		System.out.println("reverse of a string is "+x);
	}
}
