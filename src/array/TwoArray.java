package array;

public class TwoArray {
   int[][] arr=null;

    public TwoArray(int row,int col) {
arr=new int[row][col];

for (int i=0;i< arr.length;i++){

    for(int j=0;j< arr[0].length;j++){

        arr[i][j]=Integer.MIN_VALUE;
    }
}

    }
    //insert

    public void inser(int index1,int index2,int value){

      if(arr[index1][index2]==Integer.MIN_VALUE)  {

          arr[index1][index2]=value;
          System.out.println("insetred");
      }



    }

    //acess

    public int access(int i,int h){
        return arr[i][h];


    }
    //transverse

    public void trans() {


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.println(arr[i][j] + " ");


            }


        }

    }
//search

    public void search(int va){


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++){

             if(arr[i][j]==va) {


                 System.out.println("found");
             }


            }



    }

}}