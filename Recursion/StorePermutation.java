// store the permutation of a given string in an arraylist.

import java.util.ArrayList;

public class StorePermutation {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = new ArrayList<>();
        printPerm(str, "", result);
        System.out.println(result);
    }

    public static void printPerm(String str, String permutation, ArrayList<String> result) {

        if (str.length() == 0) {
            result.add(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPerm(remaining, permutation + currChar, result);
        }

    }

}