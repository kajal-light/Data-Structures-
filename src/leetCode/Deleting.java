package leetCode;

import java.util.Arrays;
//remove particular number that is occuring number of times and reduce the length
//{0,1,3,0,4}
public class Deleting {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2,2};
        int n = arr.length;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2) {
                for (int j = i + 1; j < n; j++) {
                    arr[j - 1] = arr[j];

                }
n--;
            }

        }
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);

        }
        System.out.println(n);
    }
}