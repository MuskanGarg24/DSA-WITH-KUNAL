import java.util.HashSet;

// time complexity - O(2^n)

public class Subsequence {
    public static void main(String[] args) {
        subsequences("abc", 0, "");

        HashSet<String> set = new HashSet<>();

        uniqueSubsequence("aaa", 0, "", set);

        System.out.println(uniqueStringSubsequence("aaa", 0, "", set));

    }

    public static void subsequences(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        // to be
        subsequences(str, index + 1, newStr + currChar);
        // not to be
        subsequences(str, index + 1, newStr);

    }

    public static void uniqueSubsequence(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(index);
        // to be
        uniqueSubsequence(str, index + 1, newStr + currChar, set);
        // not to be
        uniqueSubsequence(str, index + 1, newStr, set);
    }

    public static String uniqueStringSubsequence(String str, int index, String newStr, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newStr)) {
                return "";
            } else {
                set.add(newStr);
                return newStr;
            }
        }
        char currChar = str.charAt(index);
        // to be
        String withChar = uniqueStringSubsequence(str, index + 1, newStr + currChar, set);
        // not to be
        String withoutChar = uniqueStringSubsequence(str, index + 1, newStr, set);
        return withChar + withoutChar;
    }
    

}
