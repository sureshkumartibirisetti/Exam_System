package venkat;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner ( System.in );
        int a=in.nextInt ();
        if (even(a)) {
            System.out.println ("even");
        }else{
            System.out.println ("odd");
        }
    }
    static boolean even(int a){
        if (a%2==0){
            return true;
        }else{
            return false;
        }
    }
}
