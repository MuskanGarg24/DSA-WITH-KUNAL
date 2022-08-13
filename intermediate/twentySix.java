import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

public class twentySix {
    public static void main(String[] args) {
        int num;
        int neg=0, pe=0, po=0;
        try(Scanner input = new Scanner(System.in)){
            do{
                System.out.print("Enter num: ");
                num = input.nextInt();
                if(num<0){
                    neg+=num;
                }
                else if(num>0){
                    if(num%2==0){
                        pe+=num;
                    }
                    else{
                        po+=num;
                    }
                }
            }
            while(num!=0);
        }
        System.out.println("Sum of negative numbers = "+ neg);
        System.out.println("Sum of positve even numbers = "+ pe);
        System.out.println("Sum of positive odd numbers = "+ po);
    }
}
