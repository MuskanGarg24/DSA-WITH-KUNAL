public class Sieve {
    public static void main(String[] args) {
        // range of numbers
        int n = 40;
        // boolean array to store prime numbers as false value
        boolean[] primes = new boolean[n+1];
        // function call
        sieve_prime(n, primes);
    }

    static void sieve_prime(int n, boolean[] primes){

        // if any composite number hits, mark it true
        for(int i=2; i*i<=n; i++){
            if(!primes[i]){
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        // printing prime numbers
        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
