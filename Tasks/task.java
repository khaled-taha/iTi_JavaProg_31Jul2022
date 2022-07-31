
/*
Write a program and ask the user to enter a few words separated by a space. Use the words to create a variable name with PascalCase. 
For example, if the user types: "number of students", display "NumberOfStudents". 
Make sure that the program is not dependent on the input. So, if the user types "NUMBER OF STUDENTS", the program should still display "NumberOfStudents".
*/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        StringBuffer sb = new StringBuffer(in.nextLine());
        int StringLength = sb.length();
        boolean change = true;
        char ch;
        int i = 0;
        
        while ( i < StringLength) {
            ch = sb.charAt(i);
            
            if(!change && (ch >= 65 && ch <= 90)){
                ch += 32;
                sb.setCharAt(i, ch);
            }
            
           else if(change && (ch >= 97 && ch <= 122)){
                ch -= 32;
                sb.setCharAt(i, ch);
            }
            
            else if (ch == ' '){
                sb.deleteCharAt(i);
                StringLength--;
                change = true;
                continue;
            }
            change = false;
            i++;
            
        }
        
        System.out.println(sb);
        
           }
