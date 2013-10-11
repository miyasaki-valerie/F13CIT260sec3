/******************************************
 * Authors: Valerie Miyasaki
 *          Daniel Blankenship
 *****************************************/
package pkg21;
import java.io.Serializable;

public class Player implements Serializable{
    
    String name;    
    int wins = 0;   //initialize the variable
    int losses = 0; //initialize the variable

    void displayStats(){
        System.out.println(wins);   //display the wins
        System.out.println(losses); //display the losses
    }
     
    public Player() {
        //constructor: creates the Player class
    }
}
