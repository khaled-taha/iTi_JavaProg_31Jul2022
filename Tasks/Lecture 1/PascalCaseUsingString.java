

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
        
        Scanner in = new Scanner(System.in);
        
       try{ 
                   
           // Take the input from the user as a line and Split it around matches of SPACE.
          String[] values = in.nextLine().toLowerCase().split(" ");
           
           // Name Convention Validation 
           if(!Character.isLetter(values[0].charAt(0))) throw new NameConventionException();
           
           String result = "";
           
        /*
           used to allocate some memory for the first lowercase character of each word every iteration
           and use this charcter directly instead of using chatAt(i) method.
        */
           char ch;
           
        for (int i = 0; i < values.length; i++) {
            
            // Step 1: store the first lowercase character of word.
            ch = values[i].charAt(0);
            
            //Step 2: Replace the first lowercase character to uppercase and add the new String to the result.
            result += values[i].replace(ch, Character.toUpperCase(ch));
            
           } // end for loop
        
           System.out.println(result);
        
       } catch(NameConventionException| StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException n){
           System.out.println("Error.........");
           System.out.println(n.getMessage());
              }
        }
    }
