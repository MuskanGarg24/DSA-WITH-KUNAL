// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        float a, b;
        char operator;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter number 1: ");
            a = input.nextFloat();
            System.out.print("Enter number 2: ");
            b=input.nextFloat();
            System.out.print("Enter operator: ");
            operator = input.next().charAt(0);
        }
        if(operator=='+'){
            System.out.println(a+b);
        }
        else if(operator=='-'){
            System.out.println(a-b);
        }
        else if(operator=='*'){
            System.out.println(a*b);
        }
        else if(operator=='/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid operator Input!");
        }
    }
}
