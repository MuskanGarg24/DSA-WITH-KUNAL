// max value of equation

// 50/66 test cases passed
import java.util.*;

public class Hard1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total number of points: ");
        int n = in.nextInt();

        int[][] coordinates = new int[n][2];

        System.out.print("Enter coordinates: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                coordinates[i][j] = in.nextInt();
            }
        }

        int max = 0;
        int equation;

        System.out.print("Enter k: ");
        int k = in.nextInt();

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(Math.abs(coordinates[i][0]-coordinates[j][0])<=k){
                    equation = coordinates[i][1] + coordinates[j][1] + (Math.abs(coordinates[i][0]-coordinates[j][0]));
                    max = Math.max(max, equation);
                }
            }
        }

        System.out.print("Max = "+ max);

        in.close();

    }
}
