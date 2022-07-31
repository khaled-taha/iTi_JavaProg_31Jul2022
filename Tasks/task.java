
/*
Write a program and ask the user to enter a few words separated by a space. Use the words to create a variable name with PascalCase. 
For example, if the user types: "number of students", display "NumberOfStudents". 
Make sure that the program is not dependent on the input. So, if the user types "NUMBER OF STUDENTS", the program should still display "NumberOfStudents".
*/


import java.util.Scanner;


/**
 * This class is used to throw an Exception of <Strong>NameConventionException</Strong> if the first index of the variable name is not valid.
 * The String should not start with the <em><Strong>special characters</Strong></em> like !, @, #,$, %, ^, &, *, _, +, /, ... etc, or Numbers. or <Strong>Numbers</Strong>.
 * It should start with a lowercase letter such as id, name.
 * @author Khaled Taha
 */
 class NameConventionException extends Exception{
        
        public NameConventionException() {
            super("""
                            Your String should not start with the special characters like !, @, #,$, %, ^, &, *, _, +, /, ... etc, or Numbers.
                  	      It should start with a lowercase letter such as id, name.
                        """);
            }
      }



public class PascalCase {

    public static void main(String[] args) {
        
        // Take the input from the user as an Imutable String, and then convert it to mutable String by String Buffer
        StringBuffer sb = new StringBuffer( new Scanner(System.in).nextLine());
        try{
            
            if(!Character.isLetter(sb.charAt(0))) throw new NameConventionException();
        /*
           The length of the String.
           This line will save processes when while loop check its condition every iteration.
        */
        int StringLength = sb.length();
        
        /*
           used to allocate some memory for each character every iteration
           and use this charcter directly instead of using chatAt(i) method.
        */
        char ch; 
        int i = 0; // Counter for while loop and index to catch every character using chatAt(i) method.
        
        /*
           Used to decide when we must change the case of character from uppercase to lowercase and vice versa.
           
           true:   to convert the first index of the word into Uppercase only.
           false: to convert all characters of the word between first index of it and next space character.
        */
        boolean change = true;
        
        while ( i < StringLength) {
            
            ch = sb.charAt(i); // store the character into ch variable before any process.
            
            /*
             Branch 1 : used to  convert all characters of the word between first index of it and next space character.
             if the state of change variable is false and the current character is uppercase, then convert it to lowercase.
            */
            if(!change && Character.isUpperCase(ch)){
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
            
            /*
              Branch 2:  used to convert the first index of the word into Uppercase only.
              if the state of change variable is true and the current character is lowercase, then convert it to uppercase.
            */
           else if(change &&Character.isLowerCase(ch)){
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
            
           /*
              If the current character is SPACE, then delete it.
              We must change the state of change variable from false to true
              to tell while loop that in the next iteration, the index may be the first index of a new world,  and therefore enable Branch 2.
           
             After that, We must skip the rest of the code in order not to enable branch 1,
             or enable increment operator of the counter after StringLength decrement.
           */
            else if (ch == ' '){
                sb.deleteCharAt(i);
                StringLength--;
                change = true;
                continue;
            }
            
            /*
            This value will remain false as long as the current character is not a space,
            or the next character is not the first of a new word.
            */
            change = false;
            i++;
        }
        
        
        // The output
        System.out.println("PascalCase: " + sb);
        
        } catch(NameConventionException n){
            
            System.out.println("-----------------------------------------------");
            System.out.println("Error .......");
            System.out.println(n.getMessage());
        }
    }
    
    }
