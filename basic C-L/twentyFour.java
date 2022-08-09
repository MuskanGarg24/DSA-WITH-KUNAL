import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

public class twentyFour {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        try (Scanner input = new Scanner(System.in);) {
            do {
                num = input.nextInt();
                sum += num;
            } while (num != 0);
            System.out.print("Sum = " + sum);
        }
    }
}
