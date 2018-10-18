/*
In the name of Allah, the Gracious, the Merciful 
6.16
 */
package multiples;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Multiples {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i=0; i<5; i++){
            System.out.println("Enter pair of numbers : ");
            if(isMultiple(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()))
                System.out.println("true");
            else
                System.out.println("false");
                
        }
    }
    static boolean isMultiple(int n1, int n2){
        if(n2%n1 == 0)
            return true;
        else 
            return false;
    }
    
    
}
