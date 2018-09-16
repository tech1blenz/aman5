import java.lang.*;
import java.util.*;
import java.io.*;
class Fibonnaci {
  static void fseries(int a,int i,int j)
  {
    int sum;
    if(a==0)
    {
      return ;
    }
    sum=i+j;
    System.out.println(sum);
    i=j;
    j=sum;
    fseries(a-1,i,j);
  }
  public static void main(String[] args) {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the size");
    int a=ss.nextInt();
    int i=0,j=1;
    fseries(a,i,j);
    ss.close();
  }
}