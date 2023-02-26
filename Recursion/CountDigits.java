// count the number of digits in a number using recursion

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countNum(12345));
    }
    
    static int countNum(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countNum(n/10);
    }
}
