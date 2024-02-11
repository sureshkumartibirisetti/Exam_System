package venkat;

import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age=in.nextInt ();
        String ans=eligible(age);
        System.out.println (ans);
    }
    static String eligible(int a){
        if (a<18){
            return "not eligible" ;
        }else{
            return "eligible";
        }
    }
}
