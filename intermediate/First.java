// factorial program in java

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter num: ");
        try(Scanner in = new Scanner(System.in)){
            num = in.nextInt();
        }
        int fact = 1;
        while(num!=1){
            fact = fact*num;
            num--;
        }
        System.out.print("Factorial = "+ fact);
    }
}
