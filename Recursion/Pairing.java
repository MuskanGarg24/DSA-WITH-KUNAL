public class Pairing {
    public static void main(String[] args) {
        System.out.println(countGuest(4));
    }

    public static int countGuest(int n){

        // base case
        if(n <= 1){
            return 1;
        }

        // single invite
        int single = countGuest(n-1);

        // pair invite
        int pair = (n-1)*countGuest(n-2);

        // return total ways
        return single + pair;

    }
}
