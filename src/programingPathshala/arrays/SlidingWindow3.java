package programingPathshala.arrays;

public class SlidingWindow3 {

    public static void main(String[] args) {
        int[] arr={2,5,7,9,3,8,4};
        int n=arr.length;
        int k=5;

        getSumOfKSize(arr,n,k);
    }

    private static void getSumOfKSize(int[] arr, int n, int k) {
        int countOfLegalElement=0;
        for(int i=0;i<n;i++)  {
if(arr[i]<=k)
    countOfLegalElement++;

        }
int count=0;


        for(int i=0;i<countOfLegalElement;i++)  {
if(arr[i]<=k){
    count++;
}

        }
        int max_count=count;
        for(int i=countOfLegalElement;i<n;i++){
          if(arr[i]<=k){
              count++;
          }
     if(arr[i-countOfLegalElement]<=k){

         count--;
     }
        }
max_count=Math.max(max_count,count);
        int ans=countOfLegalElement-max_count;
        System.out.println(ans);

    }

}
