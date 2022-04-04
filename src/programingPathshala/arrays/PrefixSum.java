package programingPathshala.arrays;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {


        int[] arr={1,2,3,5,4,6,7};
        int idx= arr.length-1;

        //want sum from 2---5 indices
        int l = 3,r = 5;
  int sum   =findIndicesSum(arr,idx,l,r);
       System.out.println(sum);

    }
   public static int findIndicesSum(int[] arr,int idx,int l,int r) {
       int[] Psum = new int[arr.length];
       Psum[0]=arr[0];

       for (int i = 1; i <arr.length; i++) {
           Psum[i] = arr[i]+Psum[i-1];
       }
       System.out.println(Arrays.toString(Psum));

       int ans = Psum[r] - Psum[l-1];
       return ans;

   }

}
