import java.lang.*;
import java.util.*;
import java.io.*;
class Mythread extends Thread
{
  Mythread(String name)
  {
super(name);
  }
public void run()
{
  for(int i=0;i<500;i++)
  {
    System.out.println(currentThread().getName()+":-"+i);
  }
}
}
class MultThread
{
  public static void main(String [] aa)
  {
    Mythread mm=new Mythread("Child");
    mm.start();
        for(int i=500;i<1000;i++)
    {
      System.out.println("Parent:-"+i);
    }
  }
}