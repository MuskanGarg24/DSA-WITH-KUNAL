import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        try(Scanner in = new Scanner(System.in)){
            num = in.nextInt();
        }
        evenOrOdd(num);
    }
    static void evenOrOdd(int n){
        if(n%2==0){
            System.out.println(n+" is even ");
        }
        else{
            System.out.println(n+" is odd ");
        }
    }
}
