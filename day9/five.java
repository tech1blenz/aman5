import java.util.Scanner;
public class count
{
	public static int countWords(String a)
	{
	int count = 0, x = 0;
	int n = a.length();
	char []c = a.toCharArray();
	for(int i = 0; i < n; i++)
	{
	if((i > 0 && c[i] != ' ' && c[i - 1] == ' ') || (c[0] != ' ' && (i == 0)))
	{
	count++;
	}
	}
	return count;
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	int b = countWords(a);
	System.out.println("Number of words "+b);
	}
}