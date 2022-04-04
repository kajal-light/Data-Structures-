package programingPathshala.maths;

public class HomeWorkFac {

    public static void main(String[] args) {

int[] arr={2,4,3,21};
int n=arr.length;
int sum=0;
int count=0;
int max_val=Integer.MIN_VALUE;
for(int i=0;i<n;i++) {
    count=0;
    sum=0;
  int val=(int)Math.sqrt(arr[i]) ;
    for(int j=1;j<=val;j++){

      if(arr[i]%j==0)  {
          if(j*j==arr[i]){
           sum+=j;
           count+=1;

          }else{

             sum+=j+(arr[i]/j) ;
             count+=2;
          }

      }

    }

    if(count==4){

        System.out.println(sum);
    }



}
    }

}
