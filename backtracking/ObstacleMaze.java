public class ObstacleMaze {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        obstacles("", n, m, maze);
    }

    static void obstacles(String p, int r, int c, boolean[][] maze){
        
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[r][c]==false){
            return;
        }

        if(r<maze.length-1){
            obstacles(p+'D', r+1, c, maze);
        }

        if(c<maze[0].length-1){
            obstacles(p+'R', r, c+1, maze);
        }

    }
}
