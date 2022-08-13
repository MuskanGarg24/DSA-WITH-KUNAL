import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int sum=0, num;
        int n;
        int i=1;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Total numbers: ");
            n = input.nextInt();
            System.out.println("Enter "+n+" numbers: ");
            while(i<=n){
                num = input.nextInt();
                sum=sum+num;
                i++;
            }
        }
        System.out.println("Average = "+ (float)(sum/n));
    }
}
