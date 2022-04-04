package programingPathshala.arrays;

public class LargestSubArrayOfSumK {
    public static void main(String[] args) {

//find max lenght of array whoes sum eual to target
    int[]arr={4,1,6,1,1,3};
    int n=arr.length;
    int k=5;
    int i=0;int j=0;
    int sum=0;
    int max=0;

     while(j<n) {
         sum += arr[j];
         if (sum < k) {
             j++;
         } else if (sum == k) {
             max = Math.max(max, j - i + 1);
             j++;
         }
         if (sum > k) {
             while (sum > k) {
                 sum = sum - arr[i];
                 i++;
             }
             j++;
         }

     }
        System.out.println(max);
     }
}
