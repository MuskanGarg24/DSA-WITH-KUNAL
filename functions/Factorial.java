import java.util.Scanner;

// factorial

public class Factorial {
    public static void main(String[] args) {
        int num;
        try(Scanner in = new Scanner(System.in)){
            num = in.nextInt();
        }
        int factorial = factorial(num, 1);
        System.out.println("Factorial of "+ num + " = "+ factorial);
    }

    static int factorial(int num, int fact){
        while(num>=1){
            fact = fact*num;
            num--;
        }
        return fact;
    }

}
