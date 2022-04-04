package programingPathshala.maths;

public class WinOrLose {
    public static void main(String[] args) {
      int n=20;
      int t=3;
      int a=2;int b=3;
      int k=1;
int lcm=0;
int count=0;
        int min_Value=Integer.MAX_VALUE;
        int max_Value=Integer.MIN_VALUE;
      for(int i=1;i<=t;i++) {

          min_Value = Math.min(a, b);
          max_Value = Math.max(a, b);
          //method
          while (max_Value % min_Value != 0) {

              int temp = min_Value;
              min_Value = max_Value % min_Value;
              max_Value = temp;

          }


          lcm = a * b / min_Value;
          count = n / a + n / b - 2 * n / lcm;


          if (k <= count) {
              System.out.println("win");
          } else {
              System.out.println("lose");
          }
      }
    }




}
