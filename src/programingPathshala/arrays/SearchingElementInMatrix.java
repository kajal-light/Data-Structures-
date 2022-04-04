package programingPathshala.arrays;

public class SearchingElementInMatrix {
    public static void main(String[] args) {

  int[][] arr={{10, 20, 30, 40},
               {15, 25, 35, 45},
               {27, 29, 37, 48},
               {32, 33, 39, 50}};

int num=29;
int n=arr.length;
int curNum=0;
int i=0;
int j=n-1;
while(i<n && j>=0){

        curNum=arr[i][j];

if(curNum==num){

    System.out.println(i +"  " + j);

    break;
    }else if(curNum>num){

    j--;
}else{
    i++;
}
    }

}}
