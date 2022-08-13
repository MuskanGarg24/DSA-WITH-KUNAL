import java.util.Scanner;

// java program consonant or vowel

public class twentyOne {
    public static void main(String[] args) {
        System.out.print("Enter character input: ");
        char ch;
        try(Scanner input = new Scanner(System.in)){
            ch = input.next().charAt(0);
        }
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            switch (ch) {
                case 'a':
                    System.out.println("vowel");
                    break;
                case 'e':
                    System.out.println("vowel");
                    break;
                case 'i':
                    System.out.println("vowel");
                    break;
                case 'o':
                    System.out.println("vowel");
                    break;
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'A':
                    System.out.println("vowel");
                    break;
                case 'E':
                    System.out.println("vowel");
                    break;
                case 'I':
                    System.out.println("vowel");
                    break;
                case 'O':
                    System.out.println("vowel");
                    break;
                case 'U':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("consonant");
                    break;
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
