import java.util.Scanner;

// check for pythagorean triplet

public class Triplet {
    public static void main(String[] args) {
        int base, perpendicular, hypotenuse;
        try(Scanner in = new Scanner(System.in)){
            base = in.nextInt();
            perpendicular = in.nextInt();
            hypotenuse = in.nextInt();
        }

        boolean isPythagoreanTriplet = pythagorean(base, perpendicular, hypotenuse);

        if(isPythagoreanTriplet){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    static boolean pythagorean(int b, int p, int h){
        if((h*h) == (b*b) + (p*p)){
            return true;
        }
        else{
            return false;
        }
    }
}
