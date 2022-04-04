package leetCode;

public class ValidMountain {

    public static void main(String[] args) {

       int[] arr= {0,3,2,1};
        boolean ans=validMountainArray(arr);
        System.out.println(ans);

    }
    public static boolean validMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length - 1;

        if(n<3){

            System.out.println("not valid mountain");

        }
        while (i + 1 < n && arr[i] < arr[i+1]) {
            i++;
        }

        while (j > 0 && arr[j] < arr[j-1]) {
            j--;
        }

        return (i > 0 && i == j && j < n);
    }
}
