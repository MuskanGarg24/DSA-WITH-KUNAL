// rotate array

import java.util.*;;

// brute force and TLE

public class M8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter number of moves: ");
        int k = in.nextInt();

        
        while(k>=1){
            int temp = arr[n-1];
            for(int i=n-1; i>=1; i--){
                arr[i] = arr[i-1];
            }
            arr[0]=temp;
            k--;
        }

        System.out.print("Rotated array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        in.close();
    }
}


// easy and fast approach

// public void rotate(int[] nums, int k) {
//     int n = nums.length;
//     k = k%n;

//     reverse(nums,0, n-1);

//     reverse(nums,0, k-1);

//     reverse(nums,k, n-1);
// }

// public static void reverse(int [] nums, int i, int j){
//     while(i < j){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//         i++;
//         j--;
//     }
// }
