import java.util.ArrayList;

public class NSubset {
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(5, subset);
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {

        // base case
        if (n == 0) {
            System.out.println(subset);
            return;
        }

        // add hogaa
        subset.add(n);
        findSubsets(n - 1, subset);

        // nahi add hogaa
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

}
