// subtract the sum and products of digit of an integer

import java.util.Scanner;

public class twentyTwo {
    public static void main(String[] args) {
        int num;
        try(Scanner input = new Scanner(System.in)){
            num = input.nextInt();
        }
        int product=1, sum=0;
        int rem;
        while(num>0){
            rem = num%10;
            product = product*rem;
            sum = sum + rem;
            num=num/10;
        }
        System.out.println("difference = "+ Math.abs(product-sum));
    }
}
