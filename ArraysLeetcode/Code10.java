// check if the sentence is pangram

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        boolean isPresent = true;

        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for(int i=0; i<alpha.length; i++){
            if(!sentence.contains(alpha[i])){
                isPresent = false;
                break;
            }
        }

        if(isPresent){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

        in.close();
    }
}
