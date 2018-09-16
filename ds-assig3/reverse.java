import java.lang.*;
import java.util.*;
import java.io.*;
class Reverse {
  static void printt(int a[],int n)
  {
    if(n==-1)
    {
      return ;
    }
    System.out.println(a[n]);
    printt(a,n-1);
  }
  public static void main(String[] args) {
  Scanner ss=new Scanner (System.in);
  System.out.println("enter the size");
  int a=ss.nextInt();
  int b[]=new int [a];
  for(int i=0;i<a;i++)
  {
    b[i]=ss.nextInt();
  }
   int c=b.length-1;
   printt(b,c);
  }
}