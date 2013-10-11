/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

import java.io.Serializable;

/**
 *
 * @author Valerie
 */
public class GameScore implements Serializable {
    
    private int playerScore = 0;
    private int dealerScore = 0;
    private boolean isTwentyOne = false;
    private boolean isOver= false;
    
    void displayScore(){
        if (isTwentyOne = !true){System.out.println("21! You Win!");
        } 
        else if (isOver = !true){System.out.println("BUST!");
        }
        else {System.out.println("Your score is: " + playerScore);
    } 
}
    void displayWinner(){
        if (dealerScore>playerScore && dealerScore<21){System.out.println(
                "Dealer score is: " + dealerScore + ". Sorry. You lose.");
        }
        else {System.out.println("YOU WIN!");
    }
    }

    public GameScore() {
    }

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

    public boolean isIsTwentyOne() {
        return isTwentyOne;
    }

    public void setIsTwentyOne(boolean isTwentyOne) {
        this.isTwentyOne = isTwentyOne;
    }

    public boolean isIsOver() {
        return isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }
    
}