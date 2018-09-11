import java.util.Scanner;
public class allSub
{
	public static void subStr(String a)
	{
		int x = a.length();
		for(int i = 0; i < x; i++)
		{
			for(int j = i + 1; j <= x; j++)
			{
				System.out.println(a.substring(i,j));
			}
		}
	}
	public static void main(String args[])
	{
		String a = "xyz";
		subStr(a);
	}
}