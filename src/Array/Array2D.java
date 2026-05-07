package Array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];
        arr[1][1] = 100;
        System.out.println(Arrays.deepToString(arr));

        for (int[] a : arr){
            for (int i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
