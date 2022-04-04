package myLearningArray;

import java.util.Arrays;

public class MaxProduct {

    public static void main(String[] args) {
        int[] str = {1, 4, 5, 2, 6, 7, 9};
       product(str);
    }
    public static void product(int[] t){
        Arrays.sort(t);

        int sum1=t[0]*t[1];
        int sum2=t[t.length-1]*t[t.length-2];

        int num1;
        int num2;
        if(sum1>sum2){
            num1=t[0];
            num2=t[1];
    }
else{

    num1=t[t.length-1];
    num2=t[t.length-2];

}

        System.out.println(num1 + num2);
    }

}
