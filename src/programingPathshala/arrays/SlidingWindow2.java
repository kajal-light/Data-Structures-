package programingPathshala.arrays;

public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] arr={2,2,1,2,4,6,3,22,0,44};
        int n=arr.length;
        int k=3;
        int x=2;
        getSumOfKSize(arr,n,k,x);
    }

    private static void getSumOfKSize(int[] arr, int n, int k,int x) {
        int frequency=0;
    //    int sum=0;
        for(int i=0;i<=k-1;i++)  {
            //sum+=arr[i]  ;
if(arr[i]==x){
    frequency++;

}

        }
        for(int i=k;i<n;i++){
            System.out.println("frequency1 " + frequency);
         //  System.out.println("sum1 " + sum);

        //  sum+=arr[i];
          if(arr[i]==x) {
              frequency++;

          }

   // sum -= arr[i - k];
            if(arr[i-k]==x) {

                frequency--;

            }

}

        System.out.println("frequency result " + frequency);
       // System.out.println("sum2 " + sum);


    }
}
