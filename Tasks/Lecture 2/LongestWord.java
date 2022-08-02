
 // Write a program that reads a text file and displays the longest word in the file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
       

        File file = new File("file.txt");
        

        try {
            Scanner in = new Scanner(file);
            String[] line;
            String longestWord = "";

            while (in.hasNext()) { // O(n1*(n + m)) = O(n^2)
              
                // split with character that is not letter, number or underscore
                line = in.nextLine().split("\\W"); // O(n)
              
                for (String line1 : line) { // O(m)
                    if (line1.length() > longestWord.length()) { // O(1)
                        longestWord = line1;
                    } // end if condition
                } // end foreach
            } // end while

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
      
        System.out.println(longestWord);
    }

}
