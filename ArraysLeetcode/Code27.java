// remove duplicates from sorted array

import java.util.Scanner;


public class Code27 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[j]=arr[j-1];
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        in.close();
    }
}
