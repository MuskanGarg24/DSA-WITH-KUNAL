import java.util.*;

// // spiral matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int top = 0;
        int left = 0;
        int down = matrix.length - 1;
        int right = matrix[0].length - 1;

        if (matrix.length == 0){
            return list;
        }    
        
        while (top <= down && left <= right) {
            for (int j = left; j <= right; j++)
                list.add(matrix[top][j]);
            top++;
            for (int i = top; i <= down; i++)
                list.add(matrix[i][right]);
            right--;
            if (top <= down) {
                for (int j = right; j >= left; j--)
                    list.add(matrix[down][j]);
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}
