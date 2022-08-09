// Area of rhombus

import java.util.Scanner;;

public class Sixth {
    public static void main(String[] args) {
        float d1, d2, area;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter diagonal 1: ");
            d1 = input.nextFloat();
            System.out.print("Enter diagonal 2: ");
            d2 = input.nextFloat();
        }
        area = (float)(0.5 * d1 * d2);
        System.out.println("Area"+area);
    }
}
