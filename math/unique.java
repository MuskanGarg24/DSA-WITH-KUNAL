public class unique {
    public static void main(String[] args) {
        
        int[] arr = {1,1,3,4,3,4,5};

        int unique = 0;


        for(int i: arr){
            unique ^= i;
        }

        System.out.println(unique);

    }
}
