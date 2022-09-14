import java.util.*;

class Solution {

    public void setZeroes(int[][] matrix) {
        
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        
        int len = matrix.length;
        int bre = matrix[0].length;
        
        for(int i=0;i<len;i++) {
            for(int j=0;j<bre;j++) {
                
                if(matrix[i][j] == 0) {
                    
                    if(!rows.contains(i)) {
                        rows.add(i);
                    }
                    
                    if(!columns.contains(j)) {
                        columns.add(j);
                    }
                }
                
            }
        }
        
        
        for(int row: rows) {
            
            int j = 0;
            while(j<bre) {
                
                matrix[row][j] = 0;
                j++;
            }
        }
        
        
        for(int col: columns) {
            
            int i = 0;
            while(i<len) {
                
                matrix[i][col] = 0;
                i++;
            }
        }
        
    }
    }