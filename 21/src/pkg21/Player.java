/******************************************
 * Authors: Valerie Miyasaki
 *          Daniel Blankenship
 *****************************************/
package pkg21;
import java.io.Serializable;
import java.util.Scanner;

public class Player implements Serializable{
    
    //
    // PRIVATE VARIABLES
    //
    private String name;    
    /********************************************
     *  PLAYER : Constructor
     *******************************************/
    public Player() {
        
    }
    
    /********************************************
     *  PLAYER : Display
     *******************************************/
   void inputName()
   {
       
       
   }
    
    //
    // GETTERS and SETTERS
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
