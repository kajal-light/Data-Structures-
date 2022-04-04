package leetCode;

public class Sort {

    public static void main(String[] args) {
        // bogger to smaller
        int[] arr={1,3,2,4,0,7};

        int i=0;

       int j=arr.length-1;
        int n=arr.length;

        while(i<n && j>0){
        if(arr[j]>arr[i]) {
         int tem=arr[j] ;
arr[j]=arr[i];
arr[i]=tem;
          i++;

j--;

        }
       }
        for(int s=0;s<n;s++){

            System.out.println(arr[s]);
        }


    }
}
