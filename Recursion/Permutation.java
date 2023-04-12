// time complexity: O(n!)

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }

    public static void printPerm(String str, String permutation) {

        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPerm(remaining, permutation + currChar);
        }

    }

}