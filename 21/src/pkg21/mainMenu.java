/******************************************
 * Author: Daniel Blankenship
 ******************************************/
package pkg21;
import java.io.Serializable;

public class mainMenu implements Serializable{
    String startGame = "start";
    String help = "help";
    String exit = "exit";
    String customize = "custom";
    String instructions = "instructions";
    
    public void display() {
        System.out.println(startGame);
        System.out.println(help);
        System.out.println(exit);
        System.out.println(customize);
        System.out.println(instructions);
    }
}
