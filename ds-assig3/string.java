import java.lang.*;
import java.util.*;
import java.io.*;
class  Stringsum{
  static int su;
  static void sum(int a)
  {
    int c,b;
     if(a!=0)
     {
       c=a%10;
       su=su+c;
       a=a/10;
     }
     else
     {
       System.out.println(su);
       return ;
     }
     sum(a);
     
  }
  public static void main(String[] args) {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the string");
    String s;
    s=ss.nextLine();
    int a;
    a=Integer.parseInt(s);
    
    sum(a);
  }
}