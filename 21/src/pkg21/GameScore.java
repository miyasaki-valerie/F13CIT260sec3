
package pkg21;

import java.io.Serializable;
import java.util.Scanner;

/***********************************************************
 * GAME SCORE CLASS
 * Receives and calculates the game score
 **********************************************************/
public class GameScore implements Serializable {
    
    //
    // PRIVATE VARIABLES
    //
    private int playerScore;
    private int dealerScore;
    private int playerCard1;
    private int playerCard2;
    private int dealerCard1;
    private int dealerCard2;
    
    /***********************************************************
     * INPUT PLAYER SCORE
     * input the player and dealers scores
     **********************************************************/
    void inputPlayerScore(){
        Scanner input = new Scanner(System.in);
        System.out.println("PLAYER - Card 1: ");
        this.playerCard1 = input.nextInt();
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("PLAYER - Card 2: ");
        this.playerCard2 = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("DEALER - Card 1: ");
        this.dealerCard1 = input.nextInt();
        
        Scanner input3 = new Scanner(System.in);
        System.out.println("DEALER - Card 2: ");
        this.dealerCard2 = input.nextInt();
        System.out.println("\n");
    }
    
    /***********************************************************
     * CALCULATE SCORE
     * Adds cards together and assigns the sum TOTAL variable
     **********************************************************/
    void calcScore(){
        double playerTotal;
        playerTotal = playerCard1 + playerCard2;
        
        double dealerTotal;
        dealerTotal = dealerCard1 + dealerCard2;
        
        if ((playerTotal > dealerTotal) && playerTotal < 21)
            playerScore++;
        
        if ((dealerTotal > playerTotal) && dealerTotal < 21)
            dealerScore++;        
    }
    
    /***********************************************************
     * DISPLAY SCORE
     * Displays the scores for PLAYER and DEALER
     **********************************************************/
    void displayScore(){      
        System.out.println("\tPlayer score is: \n" + playerScore);
        System.out.println("\tDealer score is: \n" + dealerScore);
    }
    
    /***********************************************************
     * DISPLAY WINNER
     * Displays who wins
     **********************************************************/
    void displayWinner(){
        if (dealerScore > playerScore){
            System.out.println(
              "\nDealer score is: " + dealerScore + ". Sorry. You lose.");
        }
        else {
            System.out.println("\nYOU WIN!");
        }
    }

    /***********************************************************
     * CONSTRUCTOR
     * Creates instance of GAME SCORE class
     **********************************************************/
    public GameScore() {
        playerScore = 0;
        dealerScore = 0;
        playerCard1 = 0;
        playerCard2 = 0;
        dealerCard1 = 0;
        dealerCard2 = 0;
    }

    //
    // GETTERS and SETTERS
    //
    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getDealerScore() {
        return dealerScore;
    }

    public void setDealerScore(int dealerScore) {
        this.dealerScore = dealerScore;
    }   
}