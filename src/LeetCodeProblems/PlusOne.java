package LeetCodeProblems;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = {1, 11, 9};
        int n = arr.length;

        while (n >= 0 && arr[n - 1] == 9) {
            arr[n - 1] = 0;
            n--;
        }


        if (n < 0) {
            arr[0] = 1;

        } else {

            arr[n - 1] += 1;

        }


        System.out.println(Arrays.toString(arr));
    }
}