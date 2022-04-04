package programingPathshala.arrays;

public class HeightWater {
    public static void main(String[] args) {


        int[] arr = {0, 1, 0, 2, 3, 0, 2, 1,8,3,5};
int n=arr.length;
int ans=getWaterHeight(arr,n);
        System.out.println(ans);

    }

    public static int getWaterHeight(int[] arr,int n){
int[] pMax=new int[n];
int[] sMax=new int[n];
int waterTrapped=0;

//find prefixMax
        pMax[0]=arr[0];
        for(int i=1;i<n;i++){
         pMax[i]  =Math.max(pMax[i-1],arr[i]);
        }
//find suffix max
      sMax[n-1]=  arr[n-1];
        for(int i=n-2;i>=0;i--){

          sMax[i]  =Math.max(sMax[i+1],arr[i]);

        }

    for(int i=0;i<n;i++) {
      int d=Math.min(pMax[i],sMax[i])  ;
        if(d>arr[i]){

           waterTrapped+=d-arr[i];
        }

    }

        return waterTrapped;
    }

}
