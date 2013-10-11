/**************************************************************
 * Authors: Valerie Miyasaki
 *          Daniel Blankenship  
 *************************************************************/
package pkg21;
import java.util.Scanner;

public class TwentyOne {
        
    String name;
    String instructions = "\n\tWelcome to the game: **21**\n\n"
            + "The instructions are as follows...\n";
    
    public static void main(String[] args) {
      TwentyOne to = new TwentyOne();
      to.getName();
      to.displayHelp();
      Player newPlayer = new Player(); //create an instance of the class
      newPlayer.displayStats();        //instance of the class & call the function
      
      GameScore yourScore = new GameScore();
      yourScore.displayScore();
      yourScore.displayWinner();
      
      GameMenu commands = new GameMenu();
      commands.showCommands();
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

