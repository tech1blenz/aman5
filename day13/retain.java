import java.util.HashSet;

public class retainques{

	public static void main(String a[]){
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < 5; i++)
		{
			hs.add(i * 10);
		}
		System.out.println("First Set");
		System.out.println(hs);
		HashSet<Integer> hs2 = new HashSet<>();
		for(int i = 3; i < 6; i++)
		{
			hs2.add(i * 10);
		}		
		System.out.println("Second Set");
		System.out.println(hs2);

		hs.retainAll(hs2);
		System.out.println("Retaining values");
		System.out.println(hs);
	}
}