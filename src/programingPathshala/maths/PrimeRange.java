package programingPathshala.maths;

import java.util.Arrays;

public class PrimeRange {

    public static void main(String[] args) {

        int n = 25;
        int[] prime = new int[n + 1];
        for (int i = 1; i <= n; i++) {

            prime[i] = 1;
        }
        prime[1] = 0;
        for (int j = 2; j * j <= n; j++) {

            if (prime[j] == 1) {
                for (int k = j; k * j <= n; k++) {

                    prime[j * k] = 0;
                }

            }
        }
        for (int i = 1; i <= n ; i++) {

            if (prime[i] == 1) {
                System.out.println(i);
            }
        }

        System.out.println(Arrays.toString(prime));
    }}
//
//
//        //brute
//   for(int i=2;i<=n;i++) {
//      if(checkPrime(i)){
//
//          System.out.println(i);
//
//      }
//
//    }
//
//}
////
//    private static boolean checkPrime(int i) {
//        for (int j = 2; j * j <= i; j++) {
//            if (i % j == 0) {
//                return false;
//            } }
//
//        return true;
//    }
   // }
