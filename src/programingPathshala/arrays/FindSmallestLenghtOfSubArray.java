package programingPathshala.arrays;
//Given an array of positive integers, find the smallest subarray’s length whose sum of elements is greater than a given number k.
public class FindSmallestLenghtOfSubArray {
    public static void main(String[] args) {
      int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
      int k=21;

     int left=0;
     int minimum=Integer.MAX_VALUE;

     int windowSum=0;

     for(int right=0;right<arr.length;right++){

         windowSum+=arr[right];

       while(windowSum>k && left<=right)  {

           minimum=Integer.min(minimum,right-left+1);

           windowSum-=arr[left];
           left++;

       }
     }

        System.out.println(minimum);





    }


}
