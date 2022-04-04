package programingPathshala.arrays;

import java.util.Arrays;

public class RotateArrayByKthTime {

    public static void main(String[] args) {
        int[] arr = {2, 3, 41, 5, 4};
        int k = 3;
       int[] ans= rotate(arr, k);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        if (k > n)
            k = k % n;
        arr = reversArray(arr, 0, n - 1);
        arr = reversArray(arr, 0, k - 1);
        arr = reversArray(arr, k, n - 1);
        return arr;
    }

    private static int[] reversArray(int[] arr, int start, int end) {

        while(start<=end){

          int temp=arr[start] ;
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    return arr;


    }

}

