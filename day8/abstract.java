import java.util.Scanner;
abstract class Animals
{
	String name,color,breed;
	Animals(String n,String c,String b)
	{
		this.name = n;
		this.color = c;
		this.breed = b;
	}
	abstract void eat();
	void speak()
	{
		System.out.println(this.name+" Speaks");
	}
}
class Dog extends Animals
{
	Dog(String n,String c,String b)
	{
		super(n,c,b);
	}
	public void eat()
	{
		System.out.println(name+" eats");
	}
}
class Cat extends Animals
{
	Cat(String n,String c,String b)
	{
		super(n,c,b);
	}
	public void eat()
	{
		System.out.println(name+" eats");
	}
}
public class abs
{
	public static void main(String args[])
	{
		Dog d = new Dog("tuffy","black","German shephard");
		Cat c = new Cat("kitty","white","persian");
		c.speak();
		c.eat();
		d.speak();
		d.eat();
	}
}