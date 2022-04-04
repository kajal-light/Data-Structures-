package arrayInterview;

public class MaxProduct {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        MaxProduct str = new MaxProduct();
        String v = str.findMaxProduct(arr);
        System.out.println(v);
    }

    private String findMaxProduct(int[] arr) {
        int maxProduct = 0;

        String pair = " ";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] > maxProduct) {
                    maxProduct = arr[i] * arr[j];

                    pair = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
                }


            }


        }
        return pair;

    }
}