package programingPathshala.arrays;

public class SumOfAllSubArray1D {

    public static void main(String[] args) {
   int[] arr={2,1,3,4,5,2,6}  ;
   int sum=0;

   //ng long m=(10^+7);
int n=arr.length;
   for(int i=0;i<arr.length;i++){


     sum+=(i+1)*(n-i)*arr[i];



   }


        System.out.println(sum);



    }


}
