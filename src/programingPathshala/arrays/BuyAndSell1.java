package programingPathshala.arrays;

import java.util.Arrays;
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


public class BuyAndSell1 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 0, 1, 5, 4};
        int n = arr.length;
     //   int profit = getMaximumProfit(arr, n);
       // System.out.println(profit);

        int ans=getProfit(arr,n);

        System.out.println(ans);
    }

    private static int getMaximumProfit(int[] arr, int n) {
        int profit1 = 0;
        int[] suffimAX = new int[n];
        suffimAX[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffimAX[i] = Math.max(suffimAX[i + 1], arr[i]);
        }

for(int i=0;i<n;i++){

    profit1=Math.max(profit1,suffimAX[i]-arr[i]);

}
        return profit1;
    }
//alternate method above use space and find profit by calculating suffix max
    //here we are not using space and solving the problem on the basis of prefix min
public static int getProfit(int[] arr,int k){

        int minValue=arr[0];
       int pro=0;
       int maxProfit=0;

       //prefixmin
       for(int i=0;i<k;i++){
           minValue=Math.min(minValue,arr[i]);
           pro=arr[i]-minValue;
           maxProfit=Math.max(pro,maxProfit);

       }

   return maxProfit;
}


}