package programingPathshala.arrays;

import java.util.Arrays;

public class ArrayRearrangment {

    public static void main(String[] args) {

     int[] arr={2,0,1,4,5,3};

     for(int i=0;i<arr.length;i++){

       if(arr[i]>=0)  {
int index=arr[i];
int val=i;
         while(index!=i)  {

int tem=arr[index];
arr[index]=-(val+1);
val=index;
index=tem;


         }

arr[index]=-(val+1);

       }
     }

     for(int i=0;i<arr.length;i++){

        arr[i]=-1*arr[i]-1;


     }

        System.out.println(Arrays.toString(arr));

    }



}
