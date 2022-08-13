import java.util.Scanner;

// Reverse A String In Java

public class Reverse {
    public static void main(String[] args) {
        String s;
        try(Scanner input = new Scanner(System.in)){
            s = input.nextLine();
        }
        int l = s.length();
        for(int i=l-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
