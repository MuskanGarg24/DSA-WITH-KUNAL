import java.util.Scanner;

// Input a number and print all the factors of that number (use loops).

public class twentyThree {
    public static void main(String[] args) {
        int num;
        try(Scanner input = new Scanner(System.in)){
            num = input.nextInt();
        }
        System.out.print("factors = ");
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
