public class SETithBit {

    static int setBitNumber(int n, int k){
        return ((1<<k) | n);
    }
    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        System.out.println(setBitNumber(n, k));
    }
}
