public class Nto1{
    public static void main(String[] args) {
        fun(5);
    }

    // N to 1
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }

    // 1 to N
    static void fun2(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }

}