package programingPathshala.arrays;

public class Permutation {
    public static void main(String[] args) {

        String s1 = "ab";
        int s1len = s1.length();
        String s2 = "eidbooo";
        int s2len = s2.length();
        boolean ans = Check(s1, s2, s1len, s2len);
        System.out.println(ans);

    }

    public static boolean Check(String s1, String s2, int s1len, int s2len) {


        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1len; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2len - s1len; i++) {

            if (isPermutaion(arr1, arr2)) {

                return true;

            }

            arr2[s2.charAt(i) - 'a']--;
            arr2[s2.charAt(i + s1len) - 'a']++;
        }


//        if (isPermutaion(arr1, arr2)) {
//
//     return true;
//
//        }
return false;

    }


    private static boolean isPermutaion(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {


                return false;
            }


        }
        return true;
    }




}



