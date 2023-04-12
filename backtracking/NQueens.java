// time complexity: O(n!)


public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int count = queens(board, 0);
        System.out.println(count);        
    }

    static int queens(boolean[][] board, int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // place queen in all possible positions
        for(int col = 0; col<board.length; col++){
            if(isSafe(board, r, col)){
                board[r][col] = true;
                count += queens(board, r+1);
                board[r][col] = false;
            }
        } 
        return count;
    }

    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean ele: row){
                if(ele){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        // check vertical row
        for(int i = 0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }
        // check left diagonal
        int maxLeft = Math.min(row, col);
        for(int i = 1; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // check right diagonal
        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

}
