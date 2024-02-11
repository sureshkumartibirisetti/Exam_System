package venkat;

import java.util.*;
import java.util.Arrays;

public class arr2d {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt ();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt ();
                System.out.println (arr[row][col]+" ");
            }
            System.out.println ();

        }

//        System.out.println ( Arrays.deepToString ( arr ) );
//        int [][] arr={
//                {1,2,3},
//                {4,5},
//                {6,7,8}
//        };
//        System.out.println ( Arrays.deepToString ( arr ) );

    }
}
