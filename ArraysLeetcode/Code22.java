import java.util.Scanner;

// Find N Unique Integers Sum up to Zero

public class Code22 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=1; i<=n/2; i++){
            arr[i-1] = i;
            arr[n-i] = -i;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        in.close();

    }
}
