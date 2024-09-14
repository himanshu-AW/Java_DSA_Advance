import java.util.Arrays;

public class SieveOfErathosthene {
    public static void main(String[] args) {

        SieveOfErathosthene obj = new SieveOfErathosthene();

        boolean isPrime[] = obj.sieveOfErathostheneAlgo(100);
        for(int i=0; i<=isPrime.length; i++) {
            if(isPrime[i]==true){
                System.out.println(i);
            }
        }
        
    }
    boolean[] sieveOfErathostheneAlgo(int n){
         boolean prime[]= new boolean[n+1];

        //  initially array of prime is true
         Arrays.fill(prime, true);

        //  make 1st and 2nd element prime fase.
         prime[0] = prime[1] = false;

            for(int i=2;i*i<=n;i++){
                for(int j=2*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }

         return prime;
    }
}
