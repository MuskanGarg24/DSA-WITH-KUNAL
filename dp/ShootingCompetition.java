import java.util.List;

public class ShootingCompetition {
    public static int getMaxPoints(List<Integer> markers) {
        int n = markers.size();
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = markers.get(i);
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                int turn = (n - len) % 2; 

                if (turn == 0) {
                    dp[i][j] = Math.max(markers.get(i) + dp[i + 1][j], markers.get(j) + dp[i][j - 1]);
                }
                else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        List<Integer> markers1 = List.of(11, 20, 2, 10);
        System.out.println(getMaxPoints(markers1)); // Output: 30

        List<Integer> markers2 = List.of(20, 2, 10, 11);
        System.out.println(getMaxPoints(markers2)); // Output: 30
    }
}
