package programingPathshala.maths;

public class GCD {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;
        int min_Value = Math.min(a, b);
        int max_Value = Math.max(a, b);
        int gcd = 0;
        //Brute force
        for (int i = 1; i <= min_Value; i++) {
            if (a % i == 0 && b % i == 0) {

                gcd = i;

            }
  }
        System.out.println(gcd);
        //method
   while(max_Value%min_Value!=0){

      int temp=min_Value;
      min_Value=max_Value%min_Value;
      max_Value=temp;

   }

        System.out.println(min_Value);

        }

    }

