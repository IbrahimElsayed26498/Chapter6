/*
In the name of Allah, the Gracious, the Merciful
 */
package squareofasterisks;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class SquareOfAsterisks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the side of the square : ");
        squareOfAsterisks(new Scanner(System.in).nextInt(),new Scanner(System.in).next().charAt(0));
    }
    static void squareOfAsterisks(int s,char ch){
        System.out.println("");
        for(int l=0;l<s;l++){
            for(int w=0; w<s; w++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    } 
}
