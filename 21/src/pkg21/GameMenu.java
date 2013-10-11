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
public class GameMenu implements Serializable {
    
    private String deal = "D";
    private String shuffle = "S";
    private String quit = "Q";
    
    
    void showCommands(){
        System.out.println("To Deal Press " + deal + ".\n"
                            + "To Shuffle Press " + shuffle +".\n"
                            + "To Quit Press " + quit + ".");
    }

    public GameMenu() {
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public String getShuffle() {
        return shuffle;
    }

    public void setShuffle(String shuffle) {
        this.shuffle = shuffle;
    }

    public String getQuit() {
        return quit;
    }

    public void setQuit(String quit) {
        this.quit = quit;
    }
    
}
