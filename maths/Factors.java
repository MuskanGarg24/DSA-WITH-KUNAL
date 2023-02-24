public class Factors {
    public static void main(String[] args) {
        int n = 20;
        System.out.print("Factors of " + n + " using 1st method = ");
        factor1(n);
        System.out.print("\nFactors of " + n + " using 2nd method = ");
        factor2(n);
    }

    // Time complexity - O(n)
    static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    // Time complexity - O(sqrt(n))
    static void factor2(int n){
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.println(i + " ");
                }
                System.out.print(i + " " + n/i + " ");
            }
        }
    }
}
