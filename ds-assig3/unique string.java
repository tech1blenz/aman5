import java.util.*;
public class conseqremover
{
	private static int i=-1;
	private static char a='\0';
	private static String sum(String s1,char a)
	{
		i++;
		char arr[]=s1.toCharArray();
		
		if(i==arr.length-1)
		{
			if(arr[i]!=arr[i-1])
			return Character.toString(arr[i]);
			else
				return "";
		}
		
		if(a!=arr[i] ){
			a=arr[i];
			return Character.toString(arr[i])+sum(s1,a);
		    }
		else
		{
			return ""+sum(s1,a);
		}
	
	}
	public static void main(String[] x)
	{
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		System.out.println(sum(s1,a));
	}
}