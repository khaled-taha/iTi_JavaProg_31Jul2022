/*
This is a program to take two numbers from the keyboard and print the max of them.
*/    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // Object from Scanner to take an input to the consol with keyboard Stream
        int num1 , num2, max;
        
        try{
               num1 = in.nextInt(); // first Input
               num2 = in.nextInt(); // second Input
              System.out.println("Max: " + Math.max(num1, num2));
              
        }catch(InputMismatchException | IllegalStateException m) {
            System.out.println("Error......!");
            System.out.println("The Scanner may be closed or you enter an invalid input");
        }
    }
