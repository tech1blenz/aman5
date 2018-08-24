
import java.util.Scanner;
class Print
{
    public void print()
    {
        System.out.println("NULL argument");
    }
    public void print(int x)
    {
        System.out.println("Integer argument"+ x);
    }
    public void print(float x)
    {
        System.out.println("float argument"+x);
    }
}
public class overload
{
    public static void main(String args[])
    {
        Print a = new Print();
        Print b = new Print();
        Print c = new Print();
        a.print();
        b.print(5);
        c.print(5.5f);
    }
}