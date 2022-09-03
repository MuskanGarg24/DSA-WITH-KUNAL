import java.util.Scanner;

// How Many Numbers Are Smaller Than the Current Number

public class Code8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        int[] count = new int[n];

        int counter=0;

        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i]>nums[j]){
                    counter++;
                }
            }
            count[i] = counter;
            counter=0;
        }

        for(int i=0; i<n; i++){
            System.out.print(count[i]+ " ");
        }

        in.close();
    }
}
