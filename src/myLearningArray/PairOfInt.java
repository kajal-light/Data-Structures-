package myLearningArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairOfInt {
    public static void main(String[] args) {


        int[] arr = {2, 4, 1, 5, 3, 6};
        int n = 8;

        PairOfInt str = new PairOfInt();

        str.findPair(arr,n);

      //  System.out.println(Arrays.toString(ans));

    }

    public void findPair(int[] arr,int v){

       Map<Integer,Integer> map=new HashMap<>();

       for(int i=0;i< arr.length;i++){
           int b=v-arr[i] ;
           int c=v/arr[i];
           if(map.containsKey(b)){
              System.out.println(" The Sum of  " + arr[i] + " and " + b + " is " + v);
            //   System.out.println("true duplicate");
           }else{
               System.out.println("false duplicate");
           }
           map.put(arr[i],i);

       }









    }


}
