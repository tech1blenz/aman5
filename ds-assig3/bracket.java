import java.util.*;
public class bracbalancer{
	private static int i=-1;
	private static int j=0;
	private static int k=0;
	private static int count=0;
	private static char a[];
private static boolean balanced(String s)
{
	i++;
	char arr[]=s.toCharArray();
	if(i==0){
	s="";
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]=='(' || arr[i]==')' || arr[i]=='{' || arr[i]=='}' || arr[i]=='[' || arr[i]==']' )
		{
			s=s+arr[i];
		}
			
	}
	a=s.toCharArray();
	k=s.length()-1;
	}
	if(j<k){
	if(((int)a[j]+2==(int)a[k]) || (int)a[j]+1==(int)a[k] )
	{
		count++;
	}
	k--;
	j++;
	String s1=new String(a);
	balanced(s1);
	if(count==s.length()/2)
	{
		return true;
	}
	else
		return false;}
	else
		return false;
	
}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String s=scan.nextLine();
		System.out.println(balanced(s));

	}

}