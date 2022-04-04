package arrayInterview;

import java.util.Arrays;

public class RotatedMatrix {
    public static void main(String[] args) {
        RotatedMatrix str =new RotatedMatrix();
      int[][] arr={{1,2,3,5},{0,5,10,4},{8,6,7,3},{2,4,3,5}} ;
      str.matrixRotated(arr);
        System.out.println(Arrays.deepToString(arr));


    }

    private boolean matrixRotated(int[][] arr) {
    if (arr.length==0||arr.length!=arr[0].length)
        return  false;
    int n= arr.length;
    for(int layer=0;layer<n/2;layer++){

        int first=layer;
        int last=n-1-layer;
        for(int i=first;i<last;i++){
         int offset=i-first;
         int top=arr[first][i];
            arr[first][i] =arr[last-offset][first] ;
             arr[last-offset][first] =arr[last][last-offset];
            arr[last][last-offset] =arr[i][last];
            arr[i][last]=top;

        }


    }

        return true;

    }

}
