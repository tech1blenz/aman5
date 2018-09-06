import java.util.Scanner;

interface Animals
{
	void speak();
	void eat();
}
class Cats implements Animals
{
	public void speak()
	{
		System.out.println("CAT meows");
	}
	public void eat()
	{
		System.out.println("cat eats fishes");
	}
}

class Dogs implements Animals
{
	public void speak()
	{
		System.out.println("DOG speaks");
	}
	public void eat()
	{
		System.out.println("DOG eats ");
	}
}

public class ani
{
	public static void main(String args[])
	{
		Dogs o1 = new Dogs();
		Cats o2 = new Cats();
		o1.speak();
		o1.eat();
		o2.speak();
		o2.eat();
	}
}