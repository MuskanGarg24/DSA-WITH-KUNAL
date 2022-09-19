import java.util.*;

// lucky number

public class Code23 {
    public static void main(String[] args) {
        
        int i,j;

        Scanner in = new Scanner(System.in);

        System.out.print("Rows = ");
        int n = in.nextInt();

        System.out.print("Cols = ");
        int m = in.nextInt();

        int[][] mat = new int[n][m];

        System.out.print("Enter matrix elements: ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                mat[i][j] = in.nextInt();
            }
        }

        List<Integer> lucky_num = new ArrayList<>();

        int[] minArr = new int[n];
        int min;
        for(i=0; i<n; i++){
            min = Integer.MAX_VALUE;
            for(j=0; j<m; j++){
                if(mat[i][j]>min){
                    min = mat[i][j];
                }
            }
            minArr[i] = min;
        }


        int[] maxArr = new int[m];
        int max;
        for(i=0; i<n; i++){
            max=0;
            for(j=0;j<m;j++){
                if(max<mat[i][j]){
                    max = mat[i][j];
                }
            }
            maxArr[i] = max;
        }

        for(i=0; i<n; i++){
            for(j=0;j<m;j++){
                if(minArr[i]==maxArr[i]){
                    lucky_num.add(minArr[i]);
                }
            }
        }
    }
}
