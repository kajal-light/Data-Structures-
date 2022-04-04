package programingPathshala.maths;

public class LCMOfArray {

    public static void main(String[] args) {

     int[] arr={4,3,2} ;

       int n=arr.length;
     int lcm=getEfficientLcm(arr) ;

        System.out.println(lcm);
    }

    private static int getEfficientLcm(int[] arr) {
int lcm=getLcm(arr[0],arr[1]);
for(int i=2;i<arr.length;i++){

    lcm=lcm*arr[i]/getGcd(lcm,arr[i]);


}

return lcm;
    }

    private static int getLcm(int i, int i1) {
        int lcm=0;
       int gcd=getGcd(i,i1) ;
       lcm=i*i1/gcd;
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
