import java.util.Scanner;

// find if a number is palindrome or not?


public class Seventeen {
    public static void main(String[] args) {
        System.out.print("enter num: ");
        int num;
        try(Scanner input = new Scanner(System.in)){
            num = input.nextInt();
        }
        int rev=0, rem;
        int n=num;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num){
            System.out.println(num+" is palindrome.");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
    }
}
