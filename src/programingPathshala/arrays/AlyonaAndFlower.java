package programingPathshala.arrays;
//
//ittle Alyona is celebrating Happy Birthday! Her mother has an array of n flowers. Each flower has some mood, the mood of i-th flower is ai. The mood can be positive, zero or negative.
//
//        Let's define a subarray as a segment of consecutive flowers. The mother suggested some set of subarrays. Alyona wants to choose several of the subarrays suggested by her mother. After that, each of the flowers will add to the girl's happiness its mood multiplied by the number of chosen subarrays the flower is in.
//
//        For example, consider the case when the mother has 5 flowers, and their moods are equal to 1,  - 2, 1, 3,  - 4. Suppose the mother suggested subarrays (1,  - 2), (3,  - 4), (1, 3), (1,  - 2, 1, 3). Then if the girl chooses the third and the fourth subarrays then:
//
//        the first flower adds 1·1 = 1 to the girl's happiness, because he is in one of chosen subarrays,
//        the second flower adds ( - 2)·1 =  - 2, because he is in one of chosen subarrays,
//        the third flower adds 1·2 = 2, because he is in two of chosen subarrays,
//        the fourth flower adds 3·2 = 6, because he is in two of chosen subarrays,
//        the fifth flower adds ( - 4)·0 = 0, because he is in no chosen subarrays.
//        Thus, in total 1 + ( - 2) + 2 + 6 + 0 = 7 is added to the girl's happiness. Alyona wants to choose such subarrays from those suggested by the mother that the value added to her happiness would be as large as possible. Help her do this!
//
//        Alyona can choose any number of the subarrays, even 0 or all suggested by her mother.

import java.util.Scanner;

public class AlyonaAndFlower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of the given array");
        int n = sc.nextInt();
        System.out.println("enter the number of subArray");
        int m = sc.nextInt();
        int maxSum=0;
        int[] arr = new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        int[] pMax = new int[arr.length];
        pMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            pMax[i] = pMax[i - 1]+arr[i];


        }

int sum=0;
        for (int i = 0; i < m; i++) {

            int l = sc.nextInt();
            int r = sc.nextInt();

             maxSum += pMax[r] - pMax[l-1];


        }
        sum=sum+maxSum;
        System.out.println(sum);
    }



}
