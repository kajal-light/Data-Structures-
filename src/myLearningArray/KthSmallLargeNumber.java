package myLearningArray;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class KthSmallLargeNumber {


    public static void main(String[] args) {
        int[] arr={2,4,3,7,8,6};
        int k=3;
        kthSmallLarge(arr,k);
    }


    public static void kthSmallLarge(int[] input1,int k) {

        int min = Integer.MIN_VALUE;
        int s=0;
        while(s< k){
          int   max = Integer.MIN_VALUE;

        for (int i = 0; i < input1.length; i++) {
            if (input1[i] > max) {

       max=input1[i];

            }


        }
        for(int i=0;i<input1.length;i++){
        if(max==input1[i]){

            input1[i]=Integer.MIN_VALUE;
        }

          //  System.out.println(input1[i]);
        }


s++;
            System.out.println(max);
        }

    }

}


