import java.util.*;
public class Array
{
	public static <S> void print(S[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
	   String st[]={"d","e","f","a","z","x"};
	   Integer a[]={34,98,3,40,2,65};
	   Double  d[]={29.34,4.67,76.54};
	   Float  f[]={3.5f,6.3f,2.4f,8.9f};
       System.out.println("String Array");
       print(st);
       System.out.println("Integer Array:");
       print(a);
        System.out.println("Double Array:");
       print(d);
        System.out.println("Float Array:");
       print(f);
	}
}