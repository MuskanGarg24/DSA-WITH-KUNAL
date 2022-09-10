import java.util.Scanner;

// Build Array from Permutation

public class Code1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            ans[i] = nums[nums[i]];
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }

        in.close();
    }
}
