import java.util.*;
class SBLOCK {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block ");
    }
    SBLOCK(){
        System.out.println("Constructor");
    }
}
 
public class Main {
    public static void main(String args[]) {
 
       SBLOCK t1 = new SBLOCK();
       SBLOCK t2 = new SBLOCK();
    }
}