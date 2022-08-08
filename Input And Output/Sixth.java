import java.util.Scanner;

// Input currency in rupees and output in USD.


public class Sixth {
    public static void main(String[] args) {
        double currency;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter currency (INR) : ");
            currency = input.nextDouble();
        }
        currency = (float)(currency*0.0125933799);
        System.out.println("Currency = "+currency+" USD");
    }
}
