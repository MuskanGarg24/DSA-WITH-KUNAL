import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        int year;
        try(Scanner input = new Scanner(System.in)){
            year = input.nextInt();
        }
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+ " is leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
