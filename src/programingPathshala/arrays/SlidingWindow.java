package programingPathshala.arrays;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr={2,3,1,4,5,6,7,22,0,44};
        int n=arr.length;
        int k=3;
 getSumOfKSize(arr,n,k);
    }

    private static void getSumOfKSize(int[] arr, int n, int k) {
        int sum=0;
      for(int i=0;i<=k-1;i++)  {

        sum+=arr[i]  ;

      }
      int maxSum=sum;
        for(int i=k;i<n;i++){
            System.out.println("sum1 " + sum);
            maxSum=Math.max(maxSum,sum);
        sum+=arr[i];
        sum-=arr[i-k];


        }

        System.out.println("max " + maxSum);

    }

}
