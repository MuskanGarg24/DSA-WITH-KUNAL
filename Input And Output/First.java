// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int num;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            num = in.nextInt();
        }
        if(num%2==0){
            System.out.println(num + " is even ");
        }
        else{
            System.out.println(num+ " is odd ");
        }
    }
}