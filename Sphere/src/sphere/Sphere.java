
package sphere;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere : ");
        double number = input.nextDouble();
        System.out.println("The volume is : " + sphereVolume(number));
    }
    
    static double sphereVolume (double radius){
        double volume = (4.0/3.0) * Math.pow(radius,3);
        return volume;
    }
    
}
