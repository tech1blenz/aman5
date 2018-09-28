import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
class filepath
{
	public void filefunct(File f2)
	{
		File arr[]=f2.listFiles();
		if(arr!=null){
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	   	for(int i=0;i<arr.length;i++){
		    if(arr[i].isDirectory())
		    {		
			File f3=new File(arr[i].getPath());
			funct(f3);
			}
	    	}}
		
	}
}
public class recursivepaths {

    public static void main(String[] args)throws Exception{
        File f1=new File("C:/");
        Filepath obj = new Filepath();
        obj.filefunct(f1);
    }
}