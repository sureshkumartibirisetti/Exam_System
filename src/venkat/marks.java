package venkat;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt ();
        System.out.println(mark(a));
    }
    static String mark(int a){
        if (a<=100 && a>=91){
            return "AA";
        }else if (a<=90 && a>=81){
            return "AB";
        }else if (a<=80 && a>=71){
            return "BB";
        }else if (a<=70 && a>=61){
            return "BC";
        }else if (a<=60 && a>=51){
            return "CD";
        }else if (a<=50 && a>=41){
            return "DD";
        }else{
            return"Fail";
        }
    }
}
