package venkat;

import java.util.Scanner;

public class flowProgram {
    public static void main(String[] args) {
        Scanner in=new Scanner ( System.in );
        String a=in.nextLine ();
        String b=in.nextLine ();
        String c=in.nextLine ();
        flow(a,b,c);
    }static String flow(String a,String b,String c){
        a=a.replace ( " ",  "-" );
        b=b.replace ( " ",  "-" );
        c=c.replace ( " ",  "-" );
        System.out.println ("01 "+a+".md");
        System.out.println ("02 "+b+".md");
        System.out.println ("03 "+c+".md");
        return "a";

    }
}
