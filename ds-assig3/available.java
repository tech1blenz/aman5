import java.lang.*;
import java.util.*;
class Search {
  static boolean check(int a[],int n)
  {
    if(a[0]==n)
    {
      return true;
    }
    else if(a[a.length-1]==n)
    {
      return true;

    }
    else
    {
      return check(a,n);

    }
  }
  public static void main(String[] args) {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the size");
    int a=ss.nextInt();
    int b[]=new int[a];
    for(int i=0;i<a;i++)
    {
     b[i]=ss.nextInt();
    }
    boolean bb=false;
    bb=check(b,10);
    System.out.println(bb);
  }
}