/**************************************************************
 * Authors: Valerie Miyasaki
 *          Daniel Blankenship  
 *************************************************************/
package pkg21;
import java.util.Scanner;

public class TwentyOne {
        
    String name;
    String instructions = "\tTHIS IS THE GAME **21**\n\n"
            + "The instructions are as follows...\n";
    
    public static void main(String[] args) {
      TwentyOne to = new TwentyOne();  //access member functions of TwentyOne
      to.getName();                    //get user name  
      to.displayHelp();                //display help options    
      
      // Shows available commands from game menu
      GameMenu commands = new GameMenu();
      commands.showCommands();
      
      // Displays the wins and losses
      Player player = new Player();
    
      // Displays the scores 
      System.out.println("\n**PLAYER SCORING**");
      GameScore score = new GameScore();
      score.requestGameSize();
      score.calcScore();        //user inputs scores        
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        this.name = input.next();
    }
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}

