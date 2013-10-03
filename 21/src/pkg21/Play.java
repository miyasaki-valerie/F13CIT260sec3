/******************************************
 * Author: Daniel Blankenship
 ******************************************/
package pkg21;
import java.io.Serializable;

public class Play implements Serializable{
    String hit = "h";
    String stand = "st";
    String shuffle = "sh";
    String deal = "d";

    public void display() {
        System.out.println(hit);
        System.out.println(stand);
        System.out.println(shuffle);
        System.out.println(deal);
    }
}
