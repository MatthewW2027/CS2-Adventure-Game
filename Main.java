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
         command = getCommand("You are now leaving your house to go to the airport. Do you enter the Taxi?");
          if (command.equals("yes")) {
            command = getCommand("You entered the taxi and arrive at the airport. Do you tip the taxi driver?");
            if (command.equals("yes")) {
               command = getCommand("The taxi driver happily accepts your tip and you head inside to the check in counter. Your bags are overweight. Do you have money to pay the fee?");
               if (command.equals("yes")) {
                  command = getCommand("You pay for the bags and you head to TSA. You're bag gets pulled for inspection. Do you fight the TSA agent?");
                  if (command.equals("yes")) {
                     System.out.println("You get arrested and are banned from flying. Have fun on Amtrak!"); 
                  }
                  else if (command.equals("no")) {
                     command = getCommand("They give you your bag back and you go to the store to get a snack and water but you do not have enough money beucase you had to pay for the bags. Do you steal the food?"); 
                     if (command.equals("yes")) {
                        System.out.println("You steal the food but you are caought on security and the police find you and force you to leave the airport."); 
                     }
                     else if (command.equals("no")) {
                        command = getCommand("You don't steal anything and head to your gate. You get on the plane but really want to fly first class. Do you sneak in?"); 
                        if (command.equals("yes")) {
                           command = getCommand("You sneak into first class and make it into someones seat but then security catches you and you are taken off the plane. Do you fight with them?");
                           if (command.equals("yes")) {
                              command = getCommand("You start assulting the police officer and you are now in federal prison. Do you email Donald Trump and ask for a pardon?"); 
                              if (command.equals("yes")) {
                                 command = getCommand("You emailed Donald Trump and he gives you a pardon but you owe him $1 billion. You do not have $1 billion so you have to steal it. Do you steal the money?");
                                 if (command.equals("yes")) {
                                    System.out.println("You tell Trump you'll take the pardon and he says you have 1 month to pay him so you try to rob a bank. This is obviously unsucsesful and are now sentanced to death. RIP.");
                                 }
                                 else if (command.equals("no")) {
                                    System.out.println("You stay in prison.");
                                 }
                                 else {
                                    System.out.println("GAME OVER! Press RUN to replay");
                                 }
                              }
                              else if (command.equals("no")) {
                                 System.out.println("You decide to stay in prison."); 
                              }
                              else {
                                 System.out.println("GAME OVER! Press RUN to replay");
                              }
                           }
                           else if (command.equals("no")) {
                              System.out.println("You are taken to court and are put in prison for 3 years."); 
                           }
                           else {
                              System.out.println("GAME OVER! Press RUN to replay");
                           }
                        }
                        else if (command.equals("no")) {
                           System.out.println("You go to your seat and settle in for a nice flight.");
                        }
                        else {
                           System.out.println("GAME OVER! Press RUN to replay");
                        }
                     }
                     else {
                        System.out.println("GAME OVER! Press RUN to replay");
                     }
                  }
                  else {
                     System.out.println("GAME OVER! Press RUN to replay");
                  }
               }
               else if (command.equals("no")) {
                  System.out.println("you are broke so you go back home."); 
               }
               else {
                  System.out.println("GAME OVER! Press RUN to replay");
               }
            }
            else if (command.equals("no")) {
               System.out.println("The taxi driver kidnapps you");
            }
            else {
               System.out.println("GAME OVER! Press RUN to replay"); 
            }
         }
         else if (command.equals("no")) {
            System.out.println("You stay at home."); 
         }
         else {
            System.out.println("GAME OVER! Press RUN to replay"); 
         }
      }
      else if (command.equals("no")) {
         System.out.println("Too bad were going to the airport."); 
          command = getCommand("You are now leaving your house to go to the airport. Do you enter the Taxi?");
          if (command.equals("yes")) {
            command = getCommand("You entered the taxi and arrive at the airport. Do you tip the taxi driver?");
            if (command.equals("yes")) {
               command = getCommand("The taxi driver happily accepts your tip and you head inside to the check in counter. Your bags are overweight. Do you have money to pay the fee?");
               if (command.equals("yes")) {
                  command = getCommand("You pay for the bags and you head to TSA. You're bag gets pulled for inspection. Do you fight the TSA agent?");
                  if (command.equals("yes")) {
                     System.out.println("You get arrested and are banned from flying. Have fun on Amtrak!"); 
                  }
                  else if (command.equals("no")) {
                     command = getCommand("They give you your bag back and you go to the store to get a snack and water but you do not have enough money beucase you had to pay for the bags. Do you steal the food?"); 
                     if (command.equals("yes")) {
                        System.out.println("You steal the food but you are caought on security and the police find you and force you to leave the airport."); 
                     }
                     else if (command.equals("no")) {
                        command = getCommand("You don't steal anything and head to your gate. You get on the plane but really want to fly first class. Do you sneak in?"); 
                        if (command.equals("yes")) {
                           command = getCommand("You sneak into first class and make it into someones seat but then security catches you and you are taken off the plane. Do you fight with them?");
                           if (command.equals("yes")) {
                              command = getCommand("You start assulting the police officer and you are now in federal prison. Do you email Donald Trump and ask for a pardon?"); 
                              if (command.equals("yes")) {
                                 command = getCommand("You emailed Donald Trump and he gives you a pardon but you owe him $1 billion. You do not have $1 billion so you have to steal it. Do you steal the money?");
                                 if (command.equals("yes")) {
                                    System.out.println("You tell Trump you'll take the pardon and he says you have 1 month to pay him so you try to rob a bank. This is obviously unsucsesful and are now sentanced to death. RIP.");
                                 }
                                 else if (command.equals("no")) {
                                    System.out.println("You stay in prison.");
                                 }
                                 else {
                                    System.out.println("GAME OVER! Press RUN to replay");
                                 }
                              }
                              else if (command.equals("no")) {
                                 System.out.println("You decide to stay in prison."); 
                              }
                              else {
                                 System.out.println("GAME OVER! Press RUN to replay");
                              }
                           }
                           else if (command.equals("no")) {
                              System.out.println("You are taken to court and are put in prison for 3 years."); 
                           }
                           else {
                              System.out.println("GAME OVER! Press RUN to replay");
                           }
                        }
                        else if (command.equals("no")) {
                           System.out.println("You go to your seat and settle in for a nice flight.");
                        }
                        else {
                           System.out.println("GAME OVER! Press RUN to replay");
                        }
                     }
                     else {
                        System.out.println("GAME OVER! Press RUN to replay");
                     }
                  }
                  else {
                     System.out.println("GAME OVER! Press RUN to replay");
                  }
               }
               else if (command.equals("no")) {
                  System.out.println("you are broke so you go back home."); 
               }
               else {
                  System.out.println("GAME OVER! Press RUN to replay");
               }
            }
            else if (command.equals("no")) {
               System.out.println("The taxi driver kidnapps you");
            }
            else {
               System.out.println("GAME OVER! Press RUN to replay"); 
            }
         }
         else if (command.equals("no")) {
            System.out.println("You stay at home."); 
         }
         else {
            System.out.println("GAME OVER! Press RUN to replay"); 
         }
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
       return command;
    } // END OF METHOD
 } // END OF CLASS

