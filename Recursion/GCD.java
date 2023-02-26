// recursion program to find the GCD of two numbers

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(12, 18));
    }

    static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a%b);
    }
}
