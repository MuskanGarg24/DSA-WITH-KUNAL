import java.util.Scanner;

// eligible for vote or not?

public class Vote {
    public static void main(String[] args) {
        int age;
        try (Scanner in = new Scanner(System.in)) {
            age = in.nextInt();
        }
        boolean isEligible = vote(age);
        if (isEligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }

    static boolean vote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
