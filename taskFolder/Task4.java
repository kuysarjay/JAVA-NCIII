package taskFolder;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = scan.nextLine();

        StringBuilder sb = new StringBuilder(word);

        System.out.println(
            (word.equals(sb.reverse().toString())) ?
            "This is a Palindrome" : "This is not a Palindrome");
           
            scan.close();
    }      
}