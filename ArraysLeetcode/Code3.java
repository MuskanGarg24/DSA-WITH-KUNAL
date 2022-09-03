// running sum
import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int[] sumArr = new int[n];

        int sum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                sum = sum + arr[j];
                sumArr[i] = sum;
            }
            sum=0;
        }

        for(int i=0; i<n; i++){
            System.out.print(sumArr[i]+" ");
        }

        in.close();
    }
}
