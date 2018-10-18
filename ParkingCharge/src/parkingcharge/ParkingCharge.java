//In the name of Allah, the Gracious, the Merciful
//6.8
package parkingcharge;

import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class ParkingCharge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter the hours parked : ");
        Scanner input = new Scanner(System.in);
        double hours = input.nextDouble();
        System.out.println("$"+calculateCharges(hours)+"0");
    }
    static double calculateCharges(double h){
        h=Math.ceil(h);
        if (h==24)
            return 10.0;
        else {
            return (2+(h-3)*0.5);
        }
    }
    
}
