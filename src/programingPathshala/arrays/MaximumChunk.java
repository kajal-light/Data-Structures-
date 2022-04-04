package programingPathshala.arrays;

public class MaximumChunk {
    public static void main(String[] args) {


        int[] arr = {1, 2, 0, 4, 3, 5};
        int n = arr.length;
        int i = 0;
        int ans = 0;
        int numberOfChunk = 0;
        int cmax = Integer.MIN_VALUE;
        //permutation with indices ere we use prefixmax concet where we find where the max number changeged
        //{1,2,0,4,3,5}
        //{1,2,2,4,4,5}
        for (int a = 0; a < n; a++) {

            cmax = Math.max(cmax, arr[a]);
            if (cmax == a) {

                numberOfChunk++;
            }

        }
         System.out.println("the number of chunks " + numberOfChunk);

//
//
//        //brute force
//        while (i < n) {
//            int j;
//            for ( j = i; j < n; j++) {
//
//                if (getCanBeChunked(i, j, arr)) {
//
//                    break;
//                }
//            }
//            i = j + 1;
//            ans++;
//        }
//        System.out.println(ans);
//    }
//
//        private static boolean getCanBeChunked(int i, int j,int[] arr){
//            int count = 0;
//            for (int k = i; k<=j; k++) {
//
//                if (arr[k] >= i && arr[k] <= j) {
//
//                    count++;
//                }
//
//                }
//            if (count == (j - i + 1)) {
//
//                return true;
//
//            }
//            return false;
//
//        }
    }
}
