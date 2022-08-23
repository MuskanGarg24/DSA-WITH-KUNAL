import java.util.Scanner;

public class sumOrProduct {
    public static void main(String[] args) {
        float a,b;
        try(Scanner in = new Scanner(System.in)){
            a = in.nextFloat();
            b = in.nextFloat();
        }
        float sum = sum(a,b);
        System.out.println("Sum = "+ sum);
        float product = product(a,b);
        System.out.println("Product = "+ product);
    }

    static float sum(float a, float b){
        return a+b;
    }
    static float product(float a, float b){
        return a*b;
    }
}
