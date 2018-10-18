/*In the name of Allah, the Gracious, the Merciful
6.17
 */
package oddoreven;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class OddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<5;i++){
            System.out.print("Enter Number : ");
            int n = new Scanner(System.in).nextInt();
            if(isEven(n))
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
    }
    static boolean isEven(int n){
        if(n%2==0)
            return true;
        return false;
    }
    
}
