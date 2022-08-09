import java.util.Scanner;

public class twentyOne {
    public static void main(String[] args) {
        int a,b,temp,n;
        a=0;
        b=1;
        try(Scanner input = new Scanner(System.in)){
            n = input.nextInt();
        }
        int count = 2;
        while(count<=n){
            temp = b;
            b = b+a;
            a = temp;
            System.out.print(b + " ");
            count++;
        }
    }
}
