import java.util.*;

public class Solution {
    class Pair {
        int first;
        int second;

        public Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    private void bfs(int r, int c, boolean[][] vis, char[][] grid) {
        vis[r][c] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            // traverse in neighbours and mark them if they are land - 8 directions
            for (int delRow = -1; delRow <= 1; delRow++) {
                for (int delCol = -1; delCol <= 1; delCol++) {
                    int nrow = row + delRow;
                    int ncol = col + delCol;
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == false
                            && grid[nrow][ncol] == '1') {
                        vis[nrow][ncol] = true;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (!vis[row][col] && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = { { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' } };
        Solution solution = new Solution();
        int numIslands = solution.numIslands(grid);
        System.out.println("Number of islands: " + numIslands);
    }

}
