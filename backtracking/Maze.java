import java.util.ArrayList;

public class Maze {
    // total paths in a grid to move from top left to bottom right. You can only
    // move right or down.

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPaths(0, 0, n, m));
        path("", n, m);
        System.out.println(pathReturn("", n, m));
        System.out.println("Diagonal Approach : " + countPathsDiagonal(0, 0, n, m));
        System.out.println(pathDiagonal("", n, m));
    }

    // count paths
    public static int countPaths(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // if we are out of bounds
        if (i == n || j == m) {
            return 0;
        }
        // move downwards
        int downPaths = countPaths(i + 1, j, n, m);
        // move right
        int rightPaths = countPaths(i, j + 1, n, m);
        return downPaths + rightPaths;
    }

    // print paths
    static void path(String p, int r, int c){
        if( r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D", r-1, c);
        }
        if(c>1){
            path(p+"R", r, c-1);
        }
    }

    // return arraylist
    static ArrayList<String> pathReturn(String p, int r, int c){
        ArrayList<String> list = new ArrayList<>();
        if( r==1 && c==1){
            list.add(p);
            return list;
        }
        if(r>1){
            list.addAll(pathReturn(p+"D", r-1, c));
        }
        if(c>1){
            list.addAll(pathReturn(p+"R", r, c-1));
        }
        return list;
    }

    // go diagonal
    public static int countPathsDiagonal(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // if we are out of bounds
        if (i == n || j == m) {
            return 0;
        }
        // move downwards
        int downPaths = countPathsDiagonal(i + 1, j, n, m);
        // move right
        int rightPaths = countPathsDiagonal(i, j + 1, n, m);
        // move diagonal
        int diagonalPaths = countPathsDiagonal(i + 1, j + 1, n, m);
        return downPaths + rightPaths + diagonalPaths;
    }

    // print diagonal paths too in the form of arraylist
    static ArrayList<String> pathDiagonal(String p, int r, int c){
        ArrayList<String> list = new ArrayList<>();
        if( r==1 && c==1){
            list.add(p);
            return list;
        }
        if(r>1){
            list.addAll(pathDiagonal(p+"V", r-1, c));
        }
        if(c>1){
            list.addAll(pathDiagonal(p+"H", r, c-1));
        }
        if(r>1 && c>1){
            list.addAll(pathDiagonal(p+"D", r-1, c-1));
        }
        return list;
    }    

}
