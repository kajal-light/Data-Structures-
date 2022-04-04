package programingPathshala.maths;

public class CommonMultipleLCM {
    public static void main(String[] args) {

   int a=2;int b=3;
   int n=20;
     int ans=getCommonMultiple(a,b,n) ;
        System.out.println(ans);
    }

    private static int getCommonMultiple(int a, int b, int n) {
       int ans=0;
       int lcm=getLcm(a,b);
      ans=n/a+n/b-n/lcm ;

       return ans;

    }

    private static int getLcm(int a, int b) {
       int lcm=0;
       lcm=a*b/getGcd(a,b);
       return lcm;

    }

    private static int getGcd(int a, int b) {

        int min_Value = Math.min(a,b);
        int max_Value = Math.max(a,b);
        //method
        while(max_Value%min_Value!=0){

            int temp=min_Value;
            min_Value=max_Value%min_Value;
            max_Value=temp;

        }
        return min_Value;


    }


}
