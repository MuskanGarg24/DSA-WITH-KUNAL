// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        float principal, time, rate, simpleInterest;

        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter principal: ");
            principal = input.nextFloat();
            System.out.print("Enter time: ");
            time = input.nextFloat();
            System.out.print("Enter rate: ");
            rate = input.nextFloat();
        }

        simpleInterest = ((principal*time*rate)/100);
        System.out.println("Simple Interest = "+ simpleInterest);
    }
}
