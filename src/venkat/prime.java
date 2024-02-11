package venkat;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt ();
        if (prime1(a)){
            System.out.println ("prime");
        }else{
            System.out.println ("not prime");
        }
    }static boolean prime1(int a){
        if (a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        if (c*c>a){
            return true;
        }return false;
    }
}
