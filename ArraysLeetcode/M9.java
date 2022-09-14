import java.util.*;

// sort colors

public class M9 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        int temp;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.print("sorted colors: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        in.close();

    }
}
