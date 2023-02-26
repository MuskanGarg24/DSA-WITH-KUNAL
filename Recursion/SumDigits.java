// recursion program to find the sum of digits of a number

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(12345));
    }

    static int sumDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }

}
