import java.util.Scanner;

// concatenation of array

public class Code2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        int[] arr = new int[n*2];

        for(int i=0;i<n;i++){
            arr[i]=arr[i+n]=nums[i];
        }

        for(int i=0; i<2*n; i++){
            System.out.print(arr[i]+" ");
        }

        in.close();
    }
}
