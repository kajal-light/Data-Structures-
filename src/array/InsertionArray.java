package array;

import java.util.NoSuchElementException;

public class InsertionArray {
   int[] arr=null;
   public InsertionArray(int sizeOfArray){

      arr=new int[sizeOfArray];
      for (int i=0;i<arr.length;i++){
          arr[i]=Integer.MIN_VALUE;

       }

   }
//insertion
   public void insert(int index,int value) {
       if (arr[index] == Integer.MIN_VALUE) {
           arr[index] = value;
           System.out.println("inserted successfully");

       } else {


           System.out.println("this cell already occupied");
       }

   }
//acceing

public int acces(int st){

     return arr[st];

       }
  //Traversal
  public void transversal(){

       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]+ " ");
       }


  }
  //serach for array
    public void serach(int value){

       for (int i=0;i< arr.length;i++){
      if(arr[i]==value) {

          System.out.println("valur os found");
      }

        }
        System.out.println("no");

   }
//delete
    public void deleteElemte(int s){


       arr[s]=Integer.MIN_VALUE;
        System.out.println("deleted succesfully");
    }


    }







