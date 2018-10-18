/*
In the name of Allah, the Gracious, the Merciful
 */
package reversingdigits;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class ReversingDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("reversed : %d%n",reversedDigit(n));
    }
    static int reversedDigit(int n){
        int newNumber=0;
        int length = (int)Math.log10(n) + 1;
        for(int i=length;i>=0;i--){
            //the next line splite the right number and multiply it in
            //10 powered to give it a value of the left number
            //i.e. if it was 21 so it takes 1*10^1 ==>10 and then 2*10^0
            //which mean 2 then addding them together ==>12 and so on 
            newNumber += (n%10)*(int)Math.pow(10,i-1);
            n/=10;
        }
        return newNumber;
    }
    
}
