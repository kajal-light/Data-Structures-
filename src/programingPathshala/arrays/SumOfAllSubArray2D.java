package programingPathshala.arrays;

public class SumOfAllSubArray2D {
    public static void main(String[] args) {


    int[][] arr={{1,2,3,4},{3,5,4,5},{2,4,3,5},{3,5,4,6}};
    int n=arr.length;

    int sum=0;

for(int i=0;i<n;i++){
for(int j=0;j<n;j++){

        sum += arr[i][j] * (i + 1) * (j + 1) * (n - i) * (n - j);
    }

}
        System.out.println(sum);
}

}