package venkat;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt ();
        int b=in.nextInt();
        System.out.println(sum1(a,b));
    }
    static int sum1(int a,int b){
        return (a+b);
    }
}
