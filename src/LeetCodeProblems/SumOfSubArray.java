package LeetCodeProblems;

public class SumOfSubArray {

    public static void main(String[] args) {
  int[] arr={-2,1,-3,4,-1,2,1,-5,4};
int n=arr.length;

  int j=0;
  int maxSum=0;
int sum=0;
for(int i=0;i<n;i++){

   sum+=arr[i] ;

   if(sum>maxSum) {
       maxSum = Math.max(maxSum, sum);
   }else{
      maxSum=maxSum-arr[j];
      j++;
   }

}
        System.out.println(maxSum);


    }


}
