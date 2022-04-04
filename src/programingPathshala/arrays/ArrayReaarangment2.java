package programingPathshala.arrays;

import java.util.Arrays;

public class ArrayReaarangment2 {

    public static void main(String[] args) {

    int[] arr={2,0,1,4,3,5}  ;

    for(int i=0;i<arr.length;i++){
     int oldValue=arr[i]% arr.length;
     arr[oldValue]=arr.length*i+arr[oldValue];


    }
        for(int i=0;i<arr.length;i++) {
arr[i]=arr[i]/arr.length;
        }
        System.out.println(Arrays.toString(arr));
    }


}
