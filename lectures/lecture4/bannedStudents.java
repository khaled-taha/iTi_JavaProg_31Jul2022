import java.util.ArrayList;
import java.util.Scanner;

public class OOPIntroduction {

        
    public static void main(String[] args) throws Exception{
            Scanner in = new Scanner(System.in);
           
           ArrayList<String> NotBandedUserNames = new ArrayList<>();
           
           // NotBandedNames of students
           NotBandedUserNames.add("ahmed   mohamed");
           NotBandedUserNames.add("mohamed");
           NotBandedUserNames.add("khaled");
           NotBandedUserNames.add("mona");
           NotBandedUserNames.add("noha");
           
           int size = NotBandedUserNames.size();
           
            // Normalize Extra White Spaces
           for (int i = 0; i < size; i++) {
            NotBandedUserNames.set(i, NotBandedUserNames.get(i).replaceAll("\\s+", " "));
        }
           
           
           // ask the user to enter any student user name.
           String userName = in.nextLine();
           try{
           if(checkUserName(NotBandedUserNames, userName)) 
                      System.out.println("Welcome : " + userName);
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
               
               
     }
    
    public static boolean checkUserName(ArrayList<String> NotBandedUserNames, String userName) throws Exception{
           if(NotBandedUserNames.contains(userName.replaceAll("\\s+", " "))) return true;
           else throw new Exception("banned student");
    }
    }
