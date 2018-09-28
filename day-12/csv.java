import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class csvfile {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\get it\\Desktop\\axe.xls");
		
		PrintWriter f2=new PrintWriter(f1);
		StringBuilder s=new StringBuilder();
		s.append("id");
        s.append('\t');
        s.append("Name");
        s.append('\n');
		    s.append("1");
		    s.append('\t');
			s.append("C:\\Users\\get it\\Desktop\\axe.xls");
            s.append("axe.xls");
            s.append("\n");
            s.append("2");
		    s.append('\t');
			s.append("C:\\Users\\get it\\Desktop\\ax.xls");
            s.append("ax.xls");
            s.append("\n");
            s.append("3");
		    s.append('\t');
			s.append("C:\\Users\\get it\\Desktop\\a.xls");
            s.append("a.xls");
            s.append("\n");
            f2.write(s.toString());
            f2.close();
            
	}

}