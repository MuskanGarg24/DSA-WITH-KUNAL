public class LCM {
    public static void main(String[] args) {
        int a = 9;
        int b = 18;
        int lcm = (a*b)/gcd(a, b);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
