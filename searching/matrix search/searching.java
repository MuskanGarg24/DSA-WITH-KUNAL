import java.util.Arrays;

public class searching {
    public static void main(String[] args) {
        
        // matrix is sorted row wise and col wise

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;

        System.out.println(Arrays.toString(search(arr, target)));

    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
