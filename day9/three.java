import java.util.Scanner;
public class removeV
{
	public static String revow(String a)
	{
		int x = a.length();
		char []c = a.toCharArray();
		String b = " ";
		for(int i = 0; i < x; i++)
		{
		if(!(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' ||c[i] == 'o' || c[i] == 'u'|| c[i] == 'A'|| c[i] == 'E'|| c[i] == 'I'|| c[i] == 'O'|| c[i] == 'U'))
			{
				b = b + a.charAt(i);
			}
		}
		return b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = revow(a);
		System.out.println("after vowel removed: "+b);
	}
}
