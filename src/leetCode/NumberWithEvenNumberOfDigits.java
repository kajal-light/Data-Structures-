package leetCode;

public class NumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

        int ans = getEvenNumberDigits(arr);
        System.out.println(ans);

    }

    private static int getEvenNumberDigits(int[] arr) {

        int even = 0;

        int num;
        for (int i = 0; i <arr.length; i++) {
            int digits = 0;

            num = arr[i];
            while (num != 0) {

                num = num/10;
                digits++;

            }

            if (digits % 2 == 0) {
                even++;


            }
        }

        return  even;
    }}