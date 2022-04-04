package leetCode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,1};
        int ans=getCount(arr);
        System.out.println("the maximum length of 1s:" + ans);
    }

    private static int getCount(int[] arr) {
        int count=0;

        int max=0;
      for (int i=0;i<arr.length;i++) {
          //int count=0;
          if(arr[i]==1){

              count++;
              max = Math.max(max,count);

          }else{

              count=0;
          }

      }


        return max;

    }


}
