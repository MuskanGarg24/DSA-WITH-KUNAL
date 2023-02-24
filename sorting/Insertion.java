// partially sort the array one by one.


import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {

        int[] arr = {1,3,2,5,4};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[i]<arr[j]){
                    swap(arr, i, j);
                }
                else{
                    break;
                }
            }
        }
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
