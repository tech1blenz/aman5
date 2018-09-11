import java.util.Scanner;
public class occur
{
	public static boolean check(String a, String b)
	{
		int flag = 0,x = 0;
		int n1 = a.length();
		int n2 = b.length();
		char []c1 = a.toCharArray();
		char []c2 = b.toCharArray();
		for(int i = 0; i < n1; i++)
		{
			
			if(c1[i] == c2[0])
			{
				while(x < n2)
				{
					if(!(c1[i] == c2[x])) flag = 1;
					x++;
					i++;
				}
			}
		}
		if(flag == 1)
        {return false;
        }
		else
        {return true;
	}
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String firsts = sc.nextLine();
		String news = sc.nextLine();
		if(check(firsts,news)) 
        {
            System.out.println("substring found");
        }
        
		else
        {
            System.out.println("substring Not found");
	   }
}
}
