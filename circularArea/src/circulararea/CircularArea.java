/*
In the name of Allah, the Gracious, the Merciful
*/
package circulararea;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class CircularArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the raduis of the circule : ");
        double Area = areaOfCicule(new Scanner(System.in).nextDouble());
        System.out.printf("Area is : %f%n",Area);
    }
    static double areaOfCicule(double r){
        return r*Math.pow(Math.PI, 2);
    }
}
