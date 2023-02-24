//Write a Java program to get the character at the given index within the String

import java.util.*;

public class One{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Entered name: "+ name);
        System.out.print("Enter index: ");
        int index = in.nextInt();
        System.out.println(name.charAt(index));
        in.close();
    }
}