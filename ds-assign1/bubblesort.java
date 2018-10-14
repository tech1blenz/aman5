import java.util.Scanner;
public class bubbleSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=scan.next();
        }
        Sort(arr);
        print(arr);
	}
	public static void Sort(String arr[])
	{
	    int l=arr.length;
        for (int i = 0; i<l-1;i++) {
            for (int j=0; j<l-i-1;j++) {
                if(arr[j+1].compareTo(arr[j])<0) {
                    String z=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=z;
                }
            }
        }
	}
	public static void print(String str[])
	{
        for(int i=0;i<str.length;i++)
        {
        	System.out.print(str[i]+" ");
        }
        
	}
}