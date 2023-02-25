public class SumOfDigits {
    public static void main(String[] args) {
        int ans = digitsSum(1342);
        System.out.println(ans);
    }

    static int digitsSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitsSum(n / 10);
    }
}
