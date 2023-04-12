import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        for(int num: arr){
            int size = outerList.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                outerList.add(internalList);
            }
        }
        return outerList;
    }

}
