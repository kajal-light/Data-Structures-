package programingPathshala.arrays;

import java.util.Arrays;

public class SufixMax {

    public static void main(String[] args) {
        int[] arr={2,4,3,5,6,7,4,6};
//idx which denotes that from that indice to till we need max num nuber
        int idx=4;
      int a  =getSufixMaxValue(arr,idx);
        System.out.println(a);
    }

    public static int getSufixMaxValue(int[] arr, int idx){
        int[] sufixMax=new int[arr.length];
        sufixMax[arr.length-1]=arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--){
            sufixMax[i]=Math.max(sufixMax[i+1],arr[i]);
        }

        System.out.println(Arrays.toString(sufixMax));
        int ans=sufixMax[idx];
        return ans;
    }


}
