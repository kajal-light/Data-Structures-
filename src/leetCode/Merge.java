package leetCode;

import java.util.Arrays;
//using pointer concept

public class Merge { public static void main(String[] args) {
            int[] a = {1,2,3,0,0,0};
            int[] b = {4, 5, 51};
            int m = 3;
            int n = 3;
            merge(a, m, b, n);
            System.out.println(Arrays.toString(a));
        }
        public static void merge(int[] nums1, int m, int[] nums2, int n) {

    //m and n is the number of element
            int i = m-1,j=n-1;
            int idx = m+n-1;
            while(j>=0 && i>=0) {
                if(nums1[i] > nums2[j]) {
                    nums1[idx] = nums1[i];
                    i--;
                } else {
                    nums1[idx] = nums2[j];
                    j--;
                }
                idx--;
            }
        }
    }

