import java.lang.*;
import java.util.*;
import java.io.*;
class Psum {
  static int sum;
  static void power(int x,int y)
  {
   
    if(y==0)
    {
      System.out.println(sum);
     return ;
    }
    sum=sum+(x*x);
    power(x,y-1);
    
  }
  public static void main(String[] args) {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the value of x");
    int x=ss.nextInt();
    System.out.println("enter the value of y");
    int y=ss.nextInt();
    power(x,y);
  }
}