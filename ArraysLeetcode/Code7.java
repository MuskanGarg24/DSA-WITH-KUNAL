import java.util.Scanner;

// Number of Good Pairs

public class Code7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j] && i<j){
                    count++;
                }
            }
        }

        System.out.println("count = "+ count);

        in.close();
    }
}
