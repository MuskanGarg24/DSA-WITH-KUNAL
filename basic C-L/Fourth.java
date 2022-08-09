// Area of isosceles triangle

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        float a,b,c,d, area;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter base: ");
            b = input.nextFloat();
            System.out.print("Enter equal side: ");
            c = input.nextFloat();
        }
        a=b/2;
        d = (float)(Math.sqrt((c*c) - (a*a)));
        area = (float)(0.5 * b * d);
        System.out.println("Area"+area);
    }
}
