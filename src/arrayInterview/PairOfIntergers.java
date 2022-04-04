package arrayInterview;

import java.util.Arrays;

//Write a program to find all pairs of integers whose sum is equal to given number
public class PairOfIntergers {
    public static void main(String[] args) {


        int[] arr = {1, 3, 4,6, 0, 2, 9};

        PairOfIntergers str = new PairOfIntergers();
int[] result=str.findPairOfIntegers(arr,7);
        System.out.println(Arrays.toString(result));

    }

    public int[] findPairOfIntegers(int[] arr, int va) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == va) {

                    return new int[]{arr[i], arr[j]};
                }
            }
        }

return new int[]{0};

    }
//another method


}

