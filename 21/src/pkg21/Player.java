/******************************************
 * Authors: Valerie Miyasaki
 *          Daniel Blankenship
 *****************************************/
package pkg21;
import java.io.Serializable;
import java.util.Scanner;

public class Player implements Serializable{
    
       Hand playerHand = new Hand(10,6,4);
       double totalTwo = playerHand.card1 + playerHand.card2;
       double totalThree = totalTwo + playerHand.card3;
       double dealerTotal = 18;
               
       void getCardValue(){
       if (totalTwo > 21){
               System.out.println("BUST!");}
      
       else if (totalTwo = 21 && dealerTotal !=21){
               System.out.println("YOU WIN!");
                       }
       
       else {
           System.out.println("Your total is " + totalTwo ". Hit or Stand?");
       }
       }
               
   }
   
    
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
