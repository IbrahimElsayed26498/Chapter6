//In the name of Allah, the Gracious, the Merciful
//this program is to round the number to the nearest integer
package roundingnumbers;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class RoundingNUmbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the a number : ");
        double number = new Scanner(System.in).nextDouble();
        double y = Math.floor(number+0.5);
        System.out.printf("number : %f%nrounding : %f%n",number,y);
    }
    
}
