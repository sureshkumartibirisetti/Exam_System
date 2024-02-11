package venkat;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(fact(a));
    }
    static int fact(int a){
        int product=1;
        while(a!=0){
            product*=a;
            a--;
        }
        return product;
    }
}
