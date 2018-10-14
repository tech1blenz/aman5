import java.util.*;
public class Max
{
    public static int max(int a[])
    {
        int m=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.print("Maximum Element of Array is:"+max(a));
    }
}