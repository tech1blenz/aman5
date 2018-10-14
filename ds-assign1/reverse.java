import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
        int  arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        Reverse(arr);
        print(arr);
	}
	public static void Reverse(int a[])
	{
	    int l=a.length;
	    int i=0;int j=l-1;
	    while(i<j)
	    {
	        int t=a[i];
	        a[i]=a[j];
	        a[j]=t;
	        i++;
	        j--;
	    }
	}
	public static void print(int st[])
	{
        for(int i=0;i<st.length;i++)
        {
        	System.out.print(st[i]+" ");
        }
        
	}
