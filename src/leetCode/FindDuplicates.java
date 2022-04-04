package leetCode;

public class FindDuplicates {

//applicable for only sorted array

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4};
        int ans = removeDuplicates(arr);

        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }


        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]);


        }
        return count;
    }
}

