package programingPathshala.arrays;

import java.util.Arrays;

public class ThreeMaximum {
    public static void main(String[] args) {


        int[] arr={3,2,5,4,66,7,44,11};
        int p=2;
        int q=3;
        int r=3;
        //i<j<k
       int ans= getSumOfMaxThreeNum(arr,p,q,r);
    }
//find the sum of three max so set the middle value so that we will get two array for i and k
    public static int getSumOfMaxThreeNum(int[] arr,int p,int q,int r){
        int[] pMax=new int[arr.length];
        int[] sMax=new int[arr.length];
        int ans=Integer.MIN_VALUE;

        //i<=j<=k
//for(int i=0;i<n;i++){
  //ans=max(ans,pmax[i]+q*arr[i]+smax[i]
  //}




//prefix max
        pMax[0]=p*arr[0];
        for(int i=1;i< arr.length;i++){

         pMax[i] =Math.max(pMax[i-1],p*arr[i])  ;

        }
        System.out.println(Arrays.toString(pMax));
//sufix max
        sMax[arr.length-1]=r*arr[arr.length-1];

        for(int i= arr.length-2;i>=0;i--){

            sMax[i] =Math.max(sMax[i+1],r*arr[i])  ;

        }

        System.out.println(Arrays.toString(sMax));
        //middle
for(int i=1;i<=arr.length-2;i++){
    //q*arr[i] is the middle one
    int first=pMax[i-1];
  int a=  q*arr[i];
     int third=sMax[i+1];
    ans=Math.max(ans,pMax[i-1]+q*arr[i]+sMax[i+1]);
}
        System.out.println(ans);
        return 0;
    }

}



