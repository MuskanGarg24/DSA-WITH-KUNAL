public class RotatedBS {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3};

        System.out.println(search(arr, 7, 0, arr.length-1));

    }

    static int search(int[] arr, int key, int s, int e){

        if(s>e){
            return -1;
        }

        int m = s+(e-s)/2;

        if(arr[m] == key){
            return m;
        }

        if(arr[s]<=m){
            if(key>=arr[s] && key<=arr[m]){
                return search(arr, key, s, m-1);
            }
            else{
                return search(arr, key, m+1, e);
            }
        }

        if(key>=arr[m] && key<=arr[e]){
            return search(arr, key, m+1, e);
        }

        return search(arr, key, s, m-1);

    }

}

/*
 * 
 * if arr[s] <= arr[mid] --> left part is sorted
 *          if key>=arr[s]<=arr[mid]
 *              end = mid - 1
 *          else
 *              start = mid + 1
 * 
 * else do the opposite for second half of the array i.e for the right part
 * 
 * else e = m - 1
 * 
 */
