public class MazeAllPaths {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        allPaths("", n, m, maze);
    }

    static void allPaths(String p, int r, int c, boolean[][] maze) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D', r + 1, c, maze);
        }

        if (c < maze[0].length - 1) {
            allPaths(p + 'R', r, c + 1, maze);
        }

        if(r>0){
            allPaths(p+"U", r-1, c, maze);
        }

        if(c>0){
            allPaths(p+"L", r, c-1, maze);
        }

        // this is the line where we backtrack
        maze[r][c] = true;

    }

}
