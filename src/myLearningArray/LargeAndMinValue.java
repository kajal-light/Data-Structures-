package myLearningArray;

public class LargeAndMinValue {

    public static void main(String[] args) {

        int[] arr={2,5,3,4,7,8,11};

        largeSmall(arr);

    }


    //brute force
    public static void largeSmall(int[] input1){

    int max=input1[0];
    int min=input1[0];

    for(int i=1;i<input1.length;i++) {

        if (input1[i] > max) {
            max = input1[i];
        }
    }
        System.out.println("max " + max);
        for(int i=1;i<input1.length;i++){
        if(input1[i]<min)
            min=input1[i];

        }
        System.out.println("min " + min);

    }
public static void largeSmallBy(int[] input2){





}

    }
