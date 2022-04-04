package programingPathshala.maths;

public class PrimeFactorization {

    public static void main(String[] args) {
       int n=404;

       int num=n;
       for(int i=2;i<=num;i++){
         while(n%i==0) {

             System.out.println(i);
             n=n/i;

         }

        }

//efficient
//
//        for(int i=2;i*i<=num;i++){
//            while(n%i==0) {
//
//                System.out.println(i);
//                n=n/i;
//
//            }
//
//        }
//if(n!=1){
//
//    System.out.println(n);
//}
    }
}
