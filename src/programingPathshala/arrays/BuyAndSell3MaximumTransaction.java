package programingPathshala.arrays;

public class BuyAndSell3MaximumTransaction {


    public static void main(String[] args) {
        int[] arr={5,2,6,1,4,7,3,6};
        int n=arr.length;
        int ans=getProfitBy(arr,n);
        System.out.println(ans);
    }
//concept is to find out the firt indice should be minum ans next is maximum
    private static int getProfitBy(int[] arr, int n) {

        int profit=0;
        for(int i=1;i<n;i++){
           if(arr[i]>arr[i-1]) {
              profit+=arr[i]-arr[i-1] ;
           }


        }



return profit;

    }
}
