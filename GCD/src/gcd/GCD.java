/*
In the name of Allah, the Gracious, the Merciful
Great Common Divisor
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers : ");
        int result = gcd(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        /*if (result == 0){
            System.out.println("There is no greater common divisor !");
            return;
        }*/
        System.out.println("Greater common Divisor is : " + result);
    }
    static int gcd(int n1,int n2){
        // we can delete the next line and let min = one of the var (any one)
        int min = (int)Math.min(n2, n2),gCD=0;
        for (int i=1;i<=min;i++){
            //if the divisor is common
            if(n1%i==0 && n2%i==0){
                //check for the greatest common
                if(i>gCD)
                    gCD=i;
            }
        }
        return gCD;
    }
    
}
