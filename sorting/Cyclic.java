// check whether arr[present index ] - 1 == present index . if not, then swap with the correct index. 

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index = arr[i]-1;
            if(i!=index){
                swap(arr,arr[i],arr[index]);
            }
            else{
                i++;
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
