// Area of circle

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        float radius;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter radius: ");
            radius = input.nextFloat();
        }
        System.out.println("Area = "+ 3.14 * radius * radius);
    }
}
