package programingPathshala.maths;

public class LCM {

    public static void main(String[] args) {
        
    int a=4;
    int b=6;
    int lcm=getLcm(a,b);


        System.out.println(lcm);
        
    }

    private static int getLcm(int a, int b) {
        
        int lcm=0;
        
       int gcd=getGcd(a,b) ;
       lcm=a*b/gcd;
        
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
