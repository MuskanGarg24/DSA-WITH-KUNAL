// first 50 natural numbers

public class Code1 {
    public static void main(String[] args) {
        print(50);
    }

    static void print(int n){
        if(n<1){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

}
