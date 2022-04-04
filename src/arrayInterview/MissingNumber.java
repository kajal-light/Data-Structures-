package arrayInterview;
//int[] arr={1,2,3,4,6,7,8,9}
//logic to find missing number is if you have to find missing number from 0 to 100 or 10
// then first cal the sum of all 100num or 10 num i.e n(n+1)/2;
//then cal the sum of number of given array
//substract it ot will be the missing number
public class MissingNumber {
    //declare and initilize the array
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        MissingNumber str = new MissingNumber();
        int v = str.findMissingNumber(arr);
        System.out.println("the missing number is: " + v);
    }

    public int findMissingNumber(int[] arr) {
        int sum1 = 0;
        int sum2 = 10 * (10 + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];

        }
int diff=sum2-sum1;
        return diff;
    }
}
