package venkat;

import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner in =new Scanner ( System.in );
        int a=in.nextInt ();
        System.out.println(nat(a));
    }
    static int nat(int a){
        int sum=0;
        for (int i=1;i<=a;i++){
            sum+=i;
        }
        return sum;
    }
}
