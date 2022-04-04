package leetCode;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[count] = arr[i];
//                count++;
//            }
//            }
////            while (count < arr.length) {
////                arr[count] = 0;
////                count++;
//
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j]);
//
//
      int right=0;
      int left=0;
      while(right<arr.length){
         if(arr[right]==0) {

             right++;
         }
         else
         {
            int temp =arr[left];

             arr[left]=arr[right];
             arr[right]=temp;


             left++;
             right++;
         }

      }
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);


      }
    }
}