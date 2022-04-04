package leetCode;

import java.util.Arrays;

public class RightMostGreatestedElment {

    public static void main(String[] args) {


        int[] arr = {17, 18, 5, 6, 16, 8};
   int[] ans=  getRightMoastMaxElement(arr);
        System.out.println(Arrays.toString(ans));
    }
//
//    public static void getRightMoastMaxElement(int[] arr) {
//        int n = arr.length;
//
//        int max = arr[n - 1];
//        arr[n - 1] = -1;
//
//        for (int i = n - 2; i >= 0; i--) {
//            int temp = arr[i];
//            arr[i] = max;
//            if (max < temp) {
//                max = temp;
//
//            }
//        }
//        for (int i = 0; i < n; i++) {
//
//            System.out.println(arr[i]);
//        }
//
//    }
////

    public static int[] getRightMoastMaxElement(int[] arr) {
        int[] prefixMax = new int[arr.length];

        prefixMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {

            prefixMax[i] = Math.max(prefixMax[i+1], arr[i]);
            // for min use min functon

        }
        System.out.println("the max number is:" + prefixMax[prefixMax.length - 1]);
    return prefixMax;

}
}