package myLearningArray;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter the length");
//        int n=s.nextInt();
//        int[] arr=new int[n];
//        System.out.println();
//        System.out.println("enter the element");
//        for (int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        MissingNumber t=new MissingNumber();
//        int ans=t.findMissingNumber(arr);
//        System.out.println(ans);
        int[] s = {1,3,5,6};
        int b = 10;
     //   printMissingNumber(s, b);
    //    missingByXor(s);


    }

//    public int findMissingNumber(int[]arr) {
//
//        Arrays.sort(arr);//in ascenting order
//       int n = arr[arr.length - 1];
//
//        int len = arr[arr.length - 1] - arr[0];
//        int totalSum = n * (n + 1) / 2;
//        int missingSequenseSum = 0;
//
//        for (int i = 1; i <= len; i++) {
//
//            missingSequenseSum += i;
//        }
//
//        int actualSum = 0;
//        int EpectedSum = totalSum - missingSequenseSum;
//        for (int i = 0; i < arr.length; i++) {
//            actualSum += arr[i];
//
//
//        }
//        if (arr[0] != 1) {
//
//            return EpectedSum - actualSum;
//
//        } else {
//
//
//            return totalSum - actualSum;
//
//        }
//
//
//    }
//method applicable when you have more than 1 missing number
//
//public static void missingByXor(int[] st){
//       int actual=st[0];
//      int expected=1;
//      for(int i=1;i<st.length;i++) {
//       actual=actual^st[i] ;
//      }
//  for(int j=2;j<=(st.length+1);j++) {
//      expected=expected^j ;
//
//      System.out.println("the missing numbers "+(actual^expected));
//  }


//
//
//    private static void printMissingNumber(int[] numbers, int count) {
//        int missingCount = count - numbers.length;
//
//    BitSet bitSet = new BitSet(count);
//    for (int number : numbers) {
//
//        bitSet.set(number-1);
//
//    }
//
//    System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
//            Arrays.toString(numbers), count);
//    int lastMissingIndex = 0;
//            for (int i = 0; i < missingCount; i++)
//            {
//                lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
//                int result=++lastMissingIndex;
//            System.out.println(result);
//
//            }
//
//    }
//
//   // Read more: https://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz7KVjMmd8a




     }


//
//
//
//
//
