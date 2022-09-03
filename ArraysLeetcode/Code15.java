import java.util.Scanner;

// diagonal sum of matrix (excluding common element of both diagonals)

public class Code15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0, sum;

        if (n == 1) {
            sum = mat[0][0];
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        sum1 = sum1 + mat[i][j];
                    }
                    if (i + j == n - 1) {
                        sum2 = sum2 + mat[i][j];
                    }
                }
            }
            if(n%2!=0){
                sum = (sum1+sum2)-mat[n/2][n/2];
            }
            else{
                sum = sum1+sum2;
            }
        }

        System.out.println("sum = "+ sum);

        in.close();
    }
}
