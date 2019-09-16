import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day6Review{

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < T; i++){
            String word = scanner.nextLine();
            char [] charArray = word.toCharArray();
            String finalString = "";
            for (int x = 0; x < word.length(); x +=2){
                finalString += String.valueOf(charArray[x]);
            }
            finalString += " ";
            for (int x =1; x< word.length();x +=2){
                finalString += String.valueOf(charArray[x]);
            }
            System.out.println(finalString);
        }
    }
}

