
 // Write a program that reads a text file and displays the longest word in the file.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public strictfp class LongestWord {

    public static void main(String[] args) {

        File file = null;
        Scanner in = null;
        String longestWord = "";

        try {

            file = new File("file.txt");
            file.createNewFile();

            in = new Scanner(file);

            String[] line;

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
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(longestWord);
    }
