// In the name of Allah, the Gracious, the Merciful
package maximumfinder;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class MaximumFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt for and input three floating-point values
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double
        // determine the maximum value
        double result = new MaximumFinder().maximum(number1, number2, number3);
        // display maximum value
        System.out.println("Maximum is: " + result);
        
        System.out.println("Maximum is: " + Math.max(number1, Math.max(number2,number3)));
    }
        // returns the maximum of its three double parameters

    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // assume x is the largest to start
        // determine whether y is greater than maximumValue
        if (y > maximumValue) {
            maximumValue = y;
        }
        // determine whether z is greater than maximumValue
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
    }
    
    public  void welcoming (){
        System.out.println("Hello");
    }
    
    
}
