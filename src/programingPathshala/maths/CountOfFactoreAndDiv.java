package programingPathshala.maths;

public class CountOfFactoreAndDiv {
        public static void main(String[] args) {
            int n = 45;
            int[] primes = new int[n + 1];
            int[] spf = new int[n + 1];
          //  int[] count=new int[n + 1];
            getFastFactor(primes, spf,n);
            int n1 = 36;
            getPrimeFactors(spf, n1);
        }

        private static void getPrimeFactors(int[] spf, int n1) {
            int numberOfTimes=0;
            while (spf[n1] != -1) {
                System.out.println(spf[n1]);
int s=n1/spf[n1];
if(spf[s]==spf[n1]){
                numberOfTimes+=(numberOfTimes+3);

}else {

    numberOfTimes=(numberOfTimes+4);
}
                n1 = n1 / spf[n1];}

            if (n1 != 1) {
               numberOfTimes+=2;
               // numberOfTimes+=1;
               System.out.println(n1);
            }
            System.out.println(numberOfTimes);
        }



        private static void getFastFactor(int[] primes, int[] spf, int n) {

            for (int i = 1; i <= n; i++) {

                primes[i] = 1;
            }
            primes[1] = 0;
            for (int i = 1; i <= n; i++) {

                spf[i] = -1;
            }

            for (int i = 2; i * i <= n; i++) {
                if (primes[i] == 1) {
                    for (int j = i; i * j <= n; j++) {
                        if (primes[i * j] == 1) {
                           spf[i * j] = i;
                           // count[spf[i*j]]++;
                            primes[i * j] = 0;
                        }
                    }
                }


            }


        }


    }








