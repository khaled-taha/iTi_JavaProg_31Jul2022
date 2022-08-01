/*
  Write a program and ask the user to enter 5 numbers. If a number has been previously entered, display an error message and ask the user to re-try.
  Once the user successfully enters 5 unique numbers, sort them and display the result on the console.
*/
       public  static void main(String[] args){
        
           Scanner in = new Scanner(System.in);
           int element;
           
           HashSet<Integer> numbers = new HashSet<>();
           
           // O(5 * (1 + 1)) = Constant 
           for (int i = 0; i < 5; i++) { 
               
               System.out.print("Number  " + (i + 1) + " : " );
               element = in.nextInt();
               
                   // check if the element already exists or not.
                   // If the element already exists, skip the current iteration.
               if(numbers.contains(i)){ // O(1)
                   System.out.println("number duplicate");
                   i--;
                   continue;
               }
               numbers.add(element); // O(1)
           }
           
           numbers.stream().sorted(); 
           System.out.println(numbers);
    }
