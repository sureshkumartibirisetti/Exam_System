package venkat;

import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner in=new Scanner ( System.in );
        int a=in.nextInt();
        int b=in.nextInt ();
        int c=in.nextInt ();
        if (tri(a,b,c)){
            System.out.println ("triplet");
        }else{
            System.out.println ("Not Triplet");
        }
    }static boolean tri(int a,int b,int c){
        if ((a*a)+(b*b)==(c*c)){
            return true;
        }
        else{
            return false;
        }
    }
}
