import java.util.*;

public class Combination3 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        sum(list, new ArrayList<Integer>(), 3, 1, 9, 0);
        System.out.println(list);
    }

    public static void sum(List<List<Integer>> outer, List<Integer> inner, int target, int idx, int remain, int count){
        if(remain < 0){
            return;
        }
        else if(count==target && remain == 0){
            outer.add(new ArrayList<>(inner));
        }
        for(int i=idx; i<=9; i++){
            inner.add(i);
            sum(outer, inner, target, i+1, remain-i, count+1);
            inner.remove(inner.size()-1);
        }
    }
}
