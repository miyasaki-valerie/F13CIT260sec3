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
public class Hand implements Serializable{
    int card1;
    int card2;
    int card3;

    public Hand(int card1, int card2, int card3) {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
    }

   
}
