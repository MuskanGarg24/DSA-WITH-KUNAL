// Area of rectangle

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        float length, width, area;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter length: ");
            length = input.nextFloat();
            System.out.print("Enter width: ");
            width = input.nextFloat();
        }
        area = (float)(length * width);
        System.out.print("Area = "+area);
    }
}
