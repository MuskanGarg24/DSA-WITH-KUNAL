// print array using recursion

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr, 0);
    }

    static void printArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index+1);
    }
}
