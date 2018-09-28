import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 2ndfile {

    public static void main(String[] args)throws Exception{
        File f1=new File("C:\\Users\\aman\\Desktop\\xyz.txt");
        File f2=new File("C:\\Users\\ravi\\documents\\ijk.txt");
        if(!f1.exists())
        {
        	f1.createNewFile();
        }
        if(!f2.exists())
        {
        	f2.createNewFile();
        }
    }
}