// find the maximum element and swap it with the element at last index.

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-1-i;
            int max_index = maxIndex(arr, 0, last);
            swap(arr, max_index, last);
        }
    }
    static int maxIndex(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
