    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Object from Scanner to take an input to the consol with keyboard Stream
        
        
        int num1 = in.nextInt(); // first Input
        int num2 = in.nextInt(); // second Input
        
        int max = (num1 > num2) ? num1 : num2; // the result will be stored in max variable
        System.out.println("Max: " + max);
    }
