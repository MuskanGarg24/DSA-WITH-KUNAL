import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the largest number from all.


public class twentyFive {
    public static void main(String[] args) {
        int num, max=0;
        try(Scanner input = new Scanner(System.in)){
            do {
                num = input.nextInt();
                max = Math.max(num, max);
            } while (num!=0);
        }
        System.out.print("Maximum = "+max);
    }
}
