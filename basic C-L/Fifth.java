// Area of parallelogram

import java.util.Scanner;;

public class Fifth {
    public static void main(String[] args) {
        float base, height, area;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter base: ");
            base = input.nextFloat();
            System.out.print("Enter height: ");
            height = input.nextFloat();
        }
        area = (float)(base * height);
        System.out.println("Area"+area);
    }
}
