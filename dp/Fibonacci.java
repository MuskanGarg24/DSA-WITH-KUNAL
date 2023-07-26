public class Fibonacci {

    // memoization
    private static int f(int n, int[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];

        return dp[n] = f(n - 1, dp) + f(n - 2, dp);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(f(n, dp));

        // tabulation
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i <= n; i++) {
            int curi = prev + prev2;
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }
}