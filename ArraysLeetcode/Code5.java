import java.util.Scanner;

// shuffle the array

public class Code5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[2*n];

        int[] arr = new int[n*2];


        for(int i=0; i<2*n; i++){
            nums[i] = in.nextInt();
        }

        int count=0;

        for(int i=0; i<n*2; i+=2){
            arr[i] = nums[count];
            arr[i+1] = nums[n+count];
            count++;
        }

        for(int i=0; i<2*n; i++){
            System.out.print(arr[i]+" ");
        }

        in.close();

    }
}
