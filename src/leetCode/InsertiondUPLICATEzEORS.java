package leetCode;

import java.util.Arrays;

public class InsertiondUPLICATEzEORS {


    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 0, 5, 0, 7, 8};

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {



                // duplicate it!
                for (int j = arr.length - 2; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}