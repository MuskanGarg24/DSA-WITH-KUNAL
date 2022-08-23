import java.util.Scanner;

// check whether prime or not?

public class Prime {
    public static void main(String[] args) {
        int num;
        try(Scanner in = new Scanner(System.in)){
            num = in.nextInt();
        }
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println(num+" is prime ");
        }
        else{
            System.out.println(num+ " is not prime");
        }
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
