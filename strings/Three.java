import java.util.Scanner;

// Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. 


public class Three {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = in.nextLine();

        System.out.print("Enter string 2: ");
        String s2 = in.nextLine();

        boolean check = true;

        if(s1.length()!=s2.length()){
            check = false;
        }
        else{
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    check=false;
                    break;
                }
            }
        }

        if(check){
            System.out.println("Strings are lexicographically equal");
        }
        else{
            System.out.println("Strings are not lexicographically equal");
        }

        in.close();
    }
}
