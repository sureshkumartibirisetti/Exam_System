package venkat;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("maximum number among 3 numbers is : "+max(a,b,c));
        System.out.println("manimum number among 3 numbers is : "+min(a,b,c));
    }
    static int max(int a,int  b,int  c){
        int temp=a;
        if (temp<b){
            temp=b;
        }if(temp<c){
            temp=c;
        }
        return temp;

    }static int min(int a,int  b,int  c){
        int temp=a;
        if (temp>b){
            temp=b;
        }if(temp>c){
            temp=c;
        }
        return temp;

    }

}
