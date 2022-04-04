package programingPathshala.maths;

public class GenratingFactors {
    public static void main(String[] args) {
        int n = 16;
        int n2 = 16;
        int val =(int)Math.sqrt(n);


        for (int i = 1; i <= val; i++) {
if( n%i==0){
    if(i*i==n){

        System.out.println("the factor on middle " + i);
    }else{
        System.out.println("the facors on left side " + i + " the factors are on right side " + n/i);
    }

} }

  //checking wheather the number of factor are even or odd

  if(val*val==n)  {

      System.out.println("odd");
  }else{
      System.out.println("even");
  }

    }
}
