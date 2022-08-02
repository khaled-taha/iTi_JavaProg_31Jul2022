 /*
          Write a program and ask the user to supply a list of comma separated numbers (e.g 5, 1, 9, 2, 10).
          If the list is empty or includes less than 5 numbers, display "Invalid List" and ask the user to re-try; otherwise, display the 3 smallest numbers in the list.
 */
        
import java.util.Arrays;

public class ListNumber {

    public static void main(String[] args) throws Exception{
       
        try{   
        String[] nums = checkList("5,    ,8,1,0,   -1");
        
        for (String num : nums) {
            System.out.print(num + " "); // -1 , 0 , 1
        }
        
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        
        
        
     }
    
    public static String[] checkList(String list) throws Exception{
        // Create an object of Exception to throw  in the case of error
        Exception error = new Exception("Invalid List");
        
        // If the list contains any characters other than numbers, commas, or spaces, then throw an error.
        if(!list.matches("(,?[ 0-9])*") || list.isBlank()) throw error;
        
           String[] nums = list.split("([ ,]+)");
           
           // If the length of numbers is less than 5 numbers,  then throw an error.
           if(nums.length < 5) throw  error;
           
           // Sorting based on Unicode
           Arrays.sort(nums);
           // return  the 3 smallest numbers
           return new String[]{nums[0], nums[1], nums[2]};
    }

    }
 
