package myLearningArray;

public class SumOfThree {
    public static void main(String[] args) {

   int[] str={1,3,4,2,1,3,2};

sumOf(str);

    }
    public static void sumOf(int[] a) {
        if (a.length == 0) {
            return;
        }

        int n = a.length;
        for (int i = 0; i < n - 2; i++) {

            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n ; k++) {
if(a[i]+a[j]+a[k]==0){


    System.out.println(a[i] +" " +a[j]+" "+a[k]);
    break;
}

                }

            }


        }

    }






}
