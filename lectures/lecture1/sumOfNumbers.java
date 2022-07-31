/*
  Write a program and continuously ask the user to enter a number or "ok" to exit.
  Calculate the sum of all the previously entered numbers and display it on the console.
*/

    public static void main(String[] args) {
        
       // An object from Scanner to take an input to the consol with in Stream.
       Scanner in = new Scanner(System.in);
       
           String value; //  Input that equals a number or word "OK" to exit.
           long sum = 0L;
           
           do{
                      System.out.print("Enter any number or exit by entering ok: ");
                      value = in.next(); // read an input from the console and store in value varibale.
                      
                      /*
                      If the value of the input is equal to "OK", 
                      the loop will be exited and the program will be terminated.
                      */
                      if(value.equalsIgnoreCase("OK")) break;
                      
                      try{
                          
                     /*
                          If the value is not equal to ok, it is necessary to have bits to complete the summation process.
                         The number will be received as a String and will be converted to Integer by the ValueOf method of the Integer class.
                         If there is a problem with the converted number, 
                         the method will throw an exception of NumberFormatException and skip the current iteration to add to the sum variable.
                     */
                      sum += Integer.valueOf(value);
                      
                      } catch( NumberFormatException n){
                                System.out.println("-------> You may have entered the wrong value");
                      }
           
           } while(true);
           
           // Final result
           System.out.println("#################################");
           System.out.println("Finished......");
           System.out.println("Sum: " + sum);
           
           }
