import java.util.Scanner;

// Reshape the Matrix

public class Code25{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] mat = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = in.nextInt();
            }
        }

        int[] arr = new int[n*m];

        int k=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[k] = mat[i][j];
                k++;
            }
        }

        int r = in.nextInt();
        int c = in.nextInt();

        int[][] newMat = new int[r][c];

        
        int z=0;
        while(z!=n*m){
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    newMat[i][j] = arr[z];
                    z++;
                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(newMat[i][j]+ " ");
            }
            System.out.println();
        }

        in.close();
    }
}