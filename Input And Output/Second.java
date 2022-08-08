// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String name;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            name = input.nextLine();
        }

        System.out.println("Hello, "+name+" !");
    }
}
