// plus one

import java.util.*;

public class Code26 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int carry=1;

        for(int i=n-1; i>=0; i++){
            if(arr[i]+carry>9){
                arr[i] = 0;
                carry = 1;
            }
            else{
                arr[i] = arr[i]+carry;
                carry = 0;
                break;
            }
        }

        if(carry==1){
            arr = new int[n+1];
            arr[0]=1;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
