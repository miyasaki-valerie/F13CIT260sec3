/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import java.io.Serializable;
/**
 *
 * @author Daniel Blankenship
 */
public class Player implements Serializable{
    
    String name;    
    int wins = 0;   //initialize the variable
    int losses = 0; //initialize the vairable

    void displayStats(){
        System.out.println(wins);   //display the wins
        System.out.println(losses); //display the losses
    }
     
    public Player() {
        //constructor: creates the Player class
    }

}
