package programingPathshala.maths;

public class PrimeFastFactor {
    public static void main(String[] args) {
        int n = 45;
        int[] primes = new int[n + 1];
        int[] spf = new int[n + 1];
        getFastFactor(primes, spf, n);
        int n1 = 36;
        getPrimeFactors(spf, n1);
    }

    private static void getPrimeFactors(int[] spf, int n1) {
        while (spf[n1] != -1) {
            System.out.println(spf[n1]);
            n1 = n1 / spf[n1];
        }
        if (n1 != 1) {
            System.out.println(n1);
        }
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
                        primes[i * j] = 0;
                    }
                }
            }


        }


    }


}
