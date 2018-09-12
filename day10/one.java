import java.util.Scanner;
import java.io.*;
public class data
{
	public static void main(String args[])
	{
		File fi = new File("/home/aman/Desktop/abc.txt");
		try
		{
			FileOutputStream fo = new FileOutputStream(fi);
			String str = " C:/Users/Test/video.mp4\nC:/Users/Test/song.mp4\nC:/Users/Test/image.mp4\nC:/Users/Test/t.mp4";

			char ch[] = str.toCharArray();
			for(int i = 0; i < str.length(); i++)
			{
				fo.write(ch[i]);
			}
			fo.close();
		}
		catch(IOException error)
		{
			System.out.println(" "+error);
		}

		try
		{

			FileInputStream fn = new FileInputStream(fi);
			Scanner inFile = new Scanner(fn);
			int i;
			while(inFile.hasNextLine())
			{
				System.out.println(inFile.nextLine());
			}
			fn.close();
		}
		catch(IOException error)
		{
			System.out.println(" "+error);
		}
	}
}