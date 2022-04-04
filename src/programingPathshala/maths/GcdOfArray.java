package programingPathshala.maths;

public class GcdOfArray {
    public static void main(String[] args) {
int[] arr={4,6};

int n= arr.length;
int gdc=0;

gdc=getGdc(arr[0],arr[1]);

for(int i=2;i<n;i++){

    gdc=getGdc(arr[i],gdc);

}

//all prime number commen factor is 2 and other are 1
if(gdc==1){

    System.out.println("yes");
}else{

    System.out.println("no");
}






    }

    private static int getGdc(int i, int i1) {
        int min_Value = Math.min(i, i1);
        int max_Value = Math.max(i, i1);
        //method
        while(max_Value%min_Value!=0){

            int temp=min_Value;
            min_Value=max_Value%min_Value;
            max_Value=temp;

        }
        return min_Value;
    }

}
