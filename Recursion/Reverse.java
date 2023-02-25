public class Reverse {
    public static void main(String[] args) {
        reverse(1824);
    }

    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }

    static int sum = 0;

    static void rev2(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev2(n/10);
    }
    
}


