public class Tower {

    static void towerOfHanoi(int n, String src, String hlpr, String dest){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, hlpr);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, hlpr, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }
}
