import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 1stfile {

    public static void main(String[] args){
        ArrayList<String> f1 = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        String a="";
        for(int i=0;i<3;i++)
        {
        a=s.nextLine();	
    	f1.add(a);
        }
         for(String i:f1) 
        {	
		 File f2=new File(i);
		 try{
		 FileInputStream f3=new FileInputStream(f2);
		 int j=f3.read();
		 while(j!=-1)
		 {
			 System.out.print((char)j);
			 j=f3.read();
		 }
		 System.out.println();}
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
        }
    }
}