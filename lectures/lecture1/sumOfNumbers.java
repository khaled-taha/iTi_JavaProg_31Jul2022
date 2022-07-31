/*
  Write a program and continuously ask the user to enter a number or "ok" to exit.
  Calculate the sum of all the previously entered numbers and display it on the console.
*/


    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
           String state;
           long sum = 0L;
           
           lable:  do{
               
               try{
                   
                 System.out.print("Enter any number or exit by entering ok: ");
                 state = br.readLine(); // input

                // input validation
                 switch(state){
                     case "OK", "Ok", "oK", "ok" -> { break lable;} // case 1 to exit
                     default -> sum += Integer.valueOf(state); //  case 2 to add the numbers entered
                 }
                 
                 } catch(NumberFormatException | IOException n){
                     // Input error
                     System.out.println("You may have entered the wrong value");
                 }
                 
           } while(true);
           
                // the result
               System.out.println("Finished....");
               System.out.println("sum: " + sum);
           }
