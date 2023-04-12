// place tiles on size 1xm in a floor of size nxm

public class Tiling {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(countTiling(n, m));
    }

    public static int countTiling(int n, int m) {
        // base case - 1
        if (n < m) {
            return 1;
        }
        // base case - 2
        if (n == m) {
            return 2;
        }
        // vertical placement
        int vertical = countTiling(n - m, m);
        // horizontal placement
        int horizontal = countTiling(n - 1, m);
        // return total ways
        return vertical + horizontal;
    }

}
