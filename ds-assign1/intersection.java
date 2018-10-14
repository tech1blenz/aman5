import java.util.*;
public class Intersection {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter size of arrays =");
		int n=scan.nextInt();
        int ar1[]=new int[n];
        int ar2[]=new int[n];
        System.out.println("insert values in array1 =");
        for(int i=0;i<n;i++)
        {
        	ar1[i]=scan.nextInt();
        }
        
        System.out.println("insert values in array2 =");
        for(int i=0;i<n;i++)
        {
        	ar2[i]=scan.nextInt();
            
        }
        Set<Integer> set1=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        {
        	if(ar1[i]==ar2[j])
        	{
        		set1.add(ar1[i]);
        	}
        }
        
        System.out.println("intersection =");
        Iterator<Integer> it=set1.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
	}
}