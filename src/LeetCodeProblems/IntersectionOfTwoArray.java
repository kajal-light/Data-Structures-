package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {


        int[] arr1 = {2, 3, 4, 3};
        int[] arr2 = {2, 3, 1};
        int n1 = arr1.length;
        int n2 = arr2.length;

        Set<Integer> set = new HashSet<>();

        for (int s : arr1) {
set.add(s);
        }

       for(int a:arr2) {
          if(set.add(a)==false){

              System.out.println(a);
          }


       }
     //two pointer concept

     int i=0;
       int j=0;
       int k=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

     while(i< arr1.length && j< arr2.length) {
        if(arr1[i]<arr2[j]) {

            i++;
        }else if(arr1[i]>arr2[j]){


            j++;
        }else{


         arr1[k] =arr1[i];
         k++;
         ++j;
         ++i;

        }

     }
int [] ans=new int[k];
    for(int h=0;h<k;h++){
ans[h]=arr1[h];

    }

        System.out.println(Arrays.toString(ans));


    }



}
