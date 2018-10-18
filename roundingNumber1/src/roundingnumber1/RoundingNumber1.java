/*
In the name of Allah, the Gracious, the Merciful
6.10
 */
package roundingnumber1;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class RoundingNumber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        double x = new Scanner(System.in).nextDouble();
        System.out.printf("Rounding to nearest integer : %f%nRounding to nearest tenth : %f%nRounding to nearest hundredths : %f%nRounding to nearest thousandths : %f%n"
                ,roundToInteger(x),roundToTenths(x),roundToHundredths(x),roundToThousands(x));
        
    }
    static float roundToInteger(double n ){
        return (float) Math.floor(n+0.5);
    }
    static float roundToTenths(double n ){
        return (float) (Math.floor(n * 10 + 0.5 )/10);
    }
    static float roundToHundredths(double n ){
        return (float) (Math.floor(n * 100 + 0.5 )/100);
    }
    static float roundToThousands(double n){
        return (float) (Math.floor(n * 1000 + 0.5 )/1000);
    }
    
}
