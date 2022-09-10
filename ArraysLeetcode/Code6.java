import java.util.Scanner;

// kids with greatest number of candies

public class Code6{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("enter size: ");
        int n = in.nextInt();

        int[] candies = new int[n];
        int[] newCandies = new int[n];
        boolean[] result = new boolean[n];

        System.out.print("enter extra candies: ");
        int extraCandies = in.nextInt();

        System.out.print("enter number of candies:");
        for(int i=0; i<n; i++){ 
            candies[i] = in.nextInt();
        }

        int max = candies[0];
        for(int i=0; i<n; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int i=0; i<n; i++){
            newCandies[i] = candies[i]+extraCandies;
        }

        for(int i=0; i<n; i++){
            if(newCandies[i]>=max){
                result[i] = true;
            }
            else{
                result[i] = false;
            }
        }


        for(int i=0; i<n; i++){
            System.out.print(result[i] + " ");
        }
        in.close();

    }
}