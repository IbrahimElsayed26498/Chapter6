/*
In the name of Allah, the Gracious, the Merciful
 */
package sparatingdigits;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class SparatingDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        displayDigit(new Scanner(System.in).nextInt());
    }
    static int intPart(int n1, int n2){
        return n1/n2 ;
    }
    static int remainderpart(int n1, int n2){
        return n1%n2;
    }
    static void displayDigit(int n){
        for(int i=(int)Math.log10(n)+1;i>=1;i--){
            //display the last number
            System.out.print(intPart(n, (int) Math.pow(10, i-1))+"  ");
            //delete the last number from the integer number
            n=remainderpart(n, (int) Math.pow(10, i-1));
        }
        System.out.println("");
    }
}
