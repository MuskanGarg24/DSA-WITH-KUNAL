import java.util.Scanner;

// richest customer wealth

public class Code4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] accounts =  new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                accounts[i][j] = in.nextInt();
            }
        }

        int sum=0;

        int max=0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum = sum + accounts[i][j];
                max = Math.max(sum, max);
            }
            sum=0;
        }
        
        System.out.println(max);

        in.close();

    }
}
