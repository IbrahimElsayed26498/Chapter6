/*
In the name of Allah, the Gracious, the Merciful
6.14
 */
package exponentitiation;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Exponentitiation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter base : ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter exponent : ");
        int e = new Scanner(System.in).nextInt();
        System.out.printf("the value is : %d%n",integerPower(b,e));
    }
    static int integerPower(int base, int exponet){
        int result = 1;
        for (int i=0; i<exponet;i++)
            result *= base;
        return result;
    }
    
}
