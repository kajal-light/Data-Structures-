package leetCode;

import java.util.Arrays;

public class SquareNumber {

    public static void main(String[] args) {
        int[] arr = {-12, -3, 0, -6, -7};

        int[] ans = getSquareNumber(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] getSquareNumber(int[] arr) {

        int len = 0;
        int n = arr.length;

        while (len < n) {

            arr[len] = arr[len] * arr[len];
            len++;
        }
for(int i=0;i<len;i++){
    System.out.println(arr[i]);

        }


        return arr;
    }


}