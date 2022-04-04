package arrayInterview;
//find whather the number is preent or not
public class FindingNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        FindingNumbers str = new FindingNumbers();
str.findingNumber(arr,5);



    }

    private void findingNumber(int[] arr, int v) {

     for (int i=0;i< arr.length;i++){

         if(arr[i]==v){

             System.out.println("the number is found at index: "+i);
             return;
         }


     }
        System.out.println("not found");


    }


}
