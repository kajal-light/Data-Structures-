package programingPathshala.arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class RowWithMax1s {

    public static void main(String[] args) {

      int[][] arr={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}}  ;
      int n=arr.length;
      int m=arr[0].length;
int indexx=0;
      int maxVal=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
          int count=0;
          for(int j=0;j<n;j++)  {

          if(arr[i][j]==1)  {
indexx=i;
           count++;

          }

           maxVal=Math.max(maxVal,count) ;
        }


      }

        System.out.println("the row "+ indexx);
        System.out.println("number of 1s "+ maxVal);

    }



}
