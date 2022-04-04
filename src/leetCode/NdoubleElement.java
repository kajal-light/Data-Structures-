package leetCode;

import java.util.HashSet;
import java.util.Set;

public class NdoubleElement {
//
//    public static void main(String[] args) {
//        int[] arr = {7, 1, 14, 11};
//
//        boolean ans = checkIfExist(arr);
//        System.out.println(ans);
//
//    }
//
//    public static boolean checkIfExist(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == 2 * arr[j]) {
//return true;
//                }
//            }
//
//
//        }
//
//        return false;
//    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int i : arr) {
            if (seen.contains(2 * i) || (i % 2 == 0 && seen.contains(i / 2))){
                return true;}
            else{
            seen.add(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {-2,0,10,-19,4,6,-8};
        boolean ans=checkIfExist(arr);
        System.out.println(ans);
    }
}







