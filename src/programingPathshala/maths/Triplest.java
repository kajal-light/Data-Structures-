package programingPathshala.maths;
//If the number is odd then three number with max LCM are n, n - 1, and n - 3.
//
//If the number is even and the GCM of n and n - 3 is 1 then the three numbers with max LCM are n, n - 1, and n - 3.
//
//Else the three numbers with max LCM are n - 1, n - 2, and n - 3.
public class Triplest {
    public static void main(String[] args) {
        int n=8;
int res;
        if(n<=2){

            System.out.println(n);
        }//odd
        if(n%2!=0) {

res=(n)*(n-1)*(n-2);
           }//even
        else if(Gcd(n,(n-3))==1){

            res=(n)*(n-1)*(n-3);
        }else{

            res=(n-1)*(n-2)*(n-3);
        }
        System.out.println(res);
        }

    private static int Gcd(int a, int b) {

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


