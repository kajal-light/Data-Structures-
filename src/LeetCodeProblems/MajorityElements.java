package LeetCodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 3, 2};
        int n = arr.length;
        int count = -1;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(arr[i])) {
//                int a = map.get(i);
//                map.put(arr[i], a + 1);
//            } else {
//
//                map.put(arr[i], 1);
//            }
//            if (map.get(arr[i]) > n / 2) {
//
//                count = arr[i];
//
//
//            }
//        }
//
//        System.out.println(count);


        //
        int maxcount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = 0; j < n; j++) {


                if (arr[i] == arr[j]) {


                    count1++;
                }
                if(count>maxcount){

                    maxcount=count1;
                    index=i;

                }
            }

        }

        if(maxcount>n/2){


            System.out.println(arr[index]);
        }else {

            System.out.println("no");
        }
    }
}



