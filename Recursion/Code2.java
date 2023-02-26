// sum of first n natural numbers

public class Code2 {
    public static void main(String[] args) {
        System.out.println(sumNums(5));
    }

    static int sum = 0;

    static int sumNums(int n){
        if(n<1){
            return sum;
        }
        sum = sum + n;
        return sumNums(n-1);
    }

}
