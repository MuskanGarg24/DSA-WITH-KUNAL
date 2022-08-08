// Take 2 numbers as input and print the largest number.


import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        int a,b;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter number 1: ");
            a = input.nextInt();
            System.out.print("Enter number 2: ");
            b = input.nextInt();
        }
        if(a>b){
            System.out.println(a+" is largest");
        }
        else{
            System.out.println(b+" is largest");
        }
    }
}