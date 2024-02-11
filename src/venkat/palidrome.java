package venkat;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner in=new Scanner ( System.in );
        int a=in.nextInt ();
        System.out.println(palid(a));

    }static String palid(int a){
        int temp=a;
        int ans=0;
        while(a>0){
            int rem=a%10;
            a=a/10;
            ans=ans*10+rem;
        }
        if (ans==temp){
            return "palindrome";
        }else{
            return "Not Palindrome";
        }
    }
}
