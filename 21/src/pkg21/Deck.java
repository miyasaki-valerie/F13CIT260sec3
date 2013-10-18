/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;
import java.io.Serializable;
import java.util.Random;
//import java.util.Random;
/**
 *
 * @author Daniel Blankenship
 */
public class Deck implements Serializable{
   /* public Card[][] fullDeck = new Card[4][13];
   
    
    /**
     *
     */
    /*public Deck(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"
        };  
        String[] values = {"A","1","2","3","4","5","6","7","8","9","10",
            "J", "Q", "K"};
        
        for (int i=1; i<suits.length; i++){
            for(int x = 0; x < values.length; x++){
                fullDeck[i][x] = new Card();
                fullDeck[i][x].suit=suits[i];
                fullDeck[i][x].value = values[x];
          
            System.out.print(fullDeck[i][x]+" ");
            System.out.println("\n");
          System.out.println();
        
            }
        }
    }
}
   
            */ double[] myCardDeck = new double[52]; 
    
    Random random = new Random();
    
    void displayDeck()
    {
        for (int i = 0; i < 52; i++)
        {
            
            myCardDeck[i] = random.nextInt(52);        
        }
        
/*        for (int i = 0; i < 52; i++)
        {
            System.out.println(i + " ");
            System.out.println(myCardDeck[i]);
            System.out.println("\n");
        } 
  */      
    }        
}

