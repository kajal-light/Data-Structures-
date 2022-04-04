package programingPathshala.arrays;

import java.util.Arrays;

public class MaxGap {

    public static void main(String[] args) {


        int[] arr = {2, 1, 4, 7};
        int n = arr.length;
        Arrays.sort(arr);//1,2,4,7
        int gap=0;
        int maxGap=0;
     for(int i=1;i<n;i++)  {

        gap=arr[i] -arr[i-1];

        maxGap=Math.max(maxGap,gap) ;
     }

        System.out.println(maxGap);
    }
}
