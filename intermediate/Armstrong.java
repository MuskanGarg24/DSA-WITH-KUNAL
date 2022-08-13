// armstrong number

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] arg){
        int num, rem, sum=0;
        System.out.print("Enter num: ");
        try(Scanner input = new Scanner(System.in)){
            num = input.nextInt();
        }
        int length = (int) (Math.log10(num) + 1);
        int n=num;
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem, length);
            n=n/10;
        }
        if(num==sum){
            System.out.println(num+" is armstrong");
        }
        else{
            System.out.println(num+" is not armstrong");
        }
    }
}