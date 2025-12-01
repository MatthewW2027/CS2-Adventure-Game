 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices

      // STEP #1: Describe the current scenario 
      System.out.println("You are about to start a new advneture. Throughout this adventure you will respond to questions by typing yes or no."); 
      // STEP #2: Get user command 
      command = getCommand("Ready to begin?");
      // STEP #3: Select a path based on the users command 
      if (command.equals("yes")) {
         // NEXT BRANCH
         System.out.println("Lets head to the airport!");
      }
      else if (command.equals("no")) {
         System.out.println("Too bad were going to the airport."); 
      }
      else {
         System.out.println("GAME OVER! Press RUN to replay."); 
      }
    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS

