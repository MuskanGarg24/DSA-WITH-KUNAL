import java.util.Scanner;

// Perfect Number In Java


public class Perfect {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int num;
        try(Scanner input = new Scanner(System.in)){
            num = input.nextInt();
        }
        int sum=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println(num+" is perfect");
        }
        else{
            System.out.println(num+" is not perfect");
        }
    }
}
