// Area of triangle

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        float height, base, area;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter height: ");
            height = input.nextFloat();
            System.out.print("Enter Base: ");
            base = input.nextFloat();
        }
        area = (float)(0.5 * height * base);
        System.out.print("Area = "+area);
    }
}
