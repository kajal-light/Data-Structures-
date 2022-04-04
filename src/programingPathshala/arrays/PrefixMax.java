package programingPathshala.arrays;

import java.util.Arrays;

public class PrefixMax {

    public static void main(String[] args) {
        int[] arr = {0, -1, 4, 2, 1, 11, 5, 8};
        int[] ans = getMax(arr);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] getMax(int[] arr) {

        int[] prefixMax = new int[arr.length];

        prefixMax[0] = arr[0];
        for (int i = 1;i< arr.length; i++) {

            prefixMax[i] = Math.max(prefixMax[i -1], arr[i]);
           // for min use min functon

        }
        System.out.println("the max number is:" + prefixMax[prefixMax.length-1]);
        return prefixMax;
    }
}