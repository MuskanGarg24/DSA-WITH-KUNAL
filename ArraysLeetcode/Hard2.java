// First Missing Positive

import java.util.*;

public class Hard2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int ans=1;

        for(int i=0; i<n; i++){
            if(arr[i]==ans){
                ans++;
            }
        }

        System.out.print(ans);

        in.close();

    }
}
