/*
In the name of Allah, the Gracious, the Merciful
 */
package cointossing;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class CoinTossing {

    private enum Coin {
        HEAD, TAILS
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int head=0,tails=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Menu Option : ");
            System.out.println("Toss Coin : 1");
            System.out.print("Enter your choise : ");
            new Scanner(System.in).nextInt();
            if(flip() == Coin.HEAD)
                head++;
            else
                tails++;
        }
        System.out.println("Head  = "+head);
        System.out.println("Tails = "+tails);

    }

    static Coin flip() {
        Coin coin = null;
        if (new SecureRandom().nextInt(2) == 0) {
            return coin.HEAD;
        } else {
            return coin.TAILS;
        }
    }
}
