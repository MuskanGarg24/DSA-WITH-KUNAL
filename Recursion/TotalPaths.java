// total paths in a grid to move from top left to bottom right. You can only move right or down.

public class TotalPaths {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPaths(0, 0, n, m));
    }

    public static int countPaths(int i, int j, int n, int m){

        // base case
        if(i == n-1 && j == m-1){
            return 1;
        }

        // if we are out of bounds
        if(i == n || j == m){
            return 0;
        }
         
        // move downwards 
        int downPaths = countPaths(i+1, j, n, m); 

        // move right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;

    }

}
