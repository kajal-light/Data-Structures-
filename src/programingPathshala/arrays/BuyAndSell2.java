package programingPathshala.arrays;

import java.util.Arrays;
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Find the maximum profit you can achieve. You may complete at most two transactions.
//
//Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
public class BuyAndSell2 {

    public static void main(String[] args) {
         int[] arr={2,3,9,1,5,6,7};
         int n=arr.length;

         int maxProfit=getProfit(arr,n);
        System.out.println(maxProfit);
    }

    private static int getProfit(int[] arr,int n) {

      //find the pmin for buy
      int[] pMin=new int[n] ;
      pMin[0]=arr[0];
      for(int i=1;i<n;i++){//2221111//{2,3,9,1,5,6,7};

         pMin[i] =Math.min(pMin[i-1],arr[i]);

      }
        System.out.println(Arrays.toString(pMin));

      //
     int[] pBuy=new int[n];
     pBuy[0]=0;

        for(int i=1;i<n;i++){//0170458//{2,3,9,1,5,6,7};
int newp=arr[i]-pMin[i];
            pBuy[i] =Math.max(pBuy[i-1],newp);

        }
        System.out.println(Arrays.toString(pBuy));

//when to sell

int[] sMax=new int[n];
sMax[n-1]=arr[n-1];
for(int i=n-2;i>=0;i--){//9997777

    sMax[i]=Math.max(sMax[i+1],arr[i] );

}
        System.out.println(Arrays.toString(sMax));


//
        int[] sProfit=new int[n];
        sProfit[n-1]=0;
        for(int i=n-2;i>=0;i--){//7606210
          int newS= sMax[i+1]-arr[i];
          sProfit[i]=Math.max(newS,sProfit[i+1]) ;
        }
        System.out.println(Arrays.toString(sProfit));


        int profit=sProfit[0];
        for(int i=1;i<n;i++){
      int twoTransaction=sProfit[i]+pBuy[i-1];
    profit=Math.max(profit,twoTransaction);

}


        return profit;

    }

}
