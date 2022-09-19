// two sum

import java.util.ArrayList;
import java.util.Scanner;

public class Code21 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    indexes.add(i);
                    indexes.add(j);
                    break;
                }
            }
        }

        for(int i=0; i<indexes.size(); i++){
            System.out.print(indexes.get(i) + " ");
        }

        in.close();
    }

}
