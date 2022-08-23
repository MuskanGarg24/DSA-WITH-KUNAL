import java.util.Scanner;

// program to find max and min of three numbers entered by the user by defining two methods..


public class MaxMin {
    public static void main(String[] args) {
        int a,b,c;
        try(Scanner in = new Scanner(System.in)){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
        int max = Max(a, b, c);
        System.out.println("max = "+ max);
        int min = Min(a,b,c);
        System.out.println("min = "+ min);
    }

    static int Max(int a, int b, int c){
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }

    static int Min(int a, int b, int c){
        int min=a;
        if(min>b){
            min = b;
        }
        if(min>c){
            min = c;
        }
        return min;
    }
}
