package arrayInterview;

public class Permutation {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 8, 6, 7, 8, 10};
        int[] arr2 = {1, 2, 3, 4, 8, 6, 7, 8, 10};
        Permutation str = new Permutation();
        boolean v = str.findPermutation(arr1,arr2);
        System.out.println(v);
    }

    private boolean findPermutation(int[] arr1, int[] arr2) {
       if(arr1.length!= arr2.length)
           return false;

       int sum1=0;
       int sum2=0;
       int mul1=1;
       int mul2=1;
       for (int i=0;i< arr1.length;i++){

           sum1+=arr1[i];
           sum2+=arr2[i];
            mul1*=arr1[i];
            mul2*=arr2[i];


       }
        if(sum1==sum2 && mul1==mul2){

            return  true;
        }

        return false;
    }

}


